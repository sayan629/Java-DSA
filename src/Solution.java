import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    static List<Integer>[] children;
    static int[] val;

    @SuppressWarnings("unchecked")
    public static long calculatePathsBeauty(int n, List<Integer> par, List<Integer> a) {
        children = new ArrayList[n + 1];
        val = new int[n + 1];
        for (int i = 1; i <= n; i++) children[i] = new ArrayList<>();

        int root = -1;
        for (int i = 0; i < n; i++) {
            val[i + 1] = a.get(i);
            int p = par.get(i);
            if (p == 0) root = i + 1;
            else children[p].add(i + 1);
        }

        long[] result = new long[1];
        int finalRoot = root;

        Thread t = new Thread(null, () -> {
            HashMap<Integer, Boolean> seen = new HashMap<>();
            seen.put(0, true);
            dfs(finalRoot, seen, 0, 0, result);
        }, "dfs", 1 << 26);
        t.start();
        try { t.join(); } catch (Exception e) {}

        return result[0];
    }

    static void dfs(int node, HashMap<Integer, Boolean> seen,
                    int prefixXor, int beauty, long[] result) {

        int newXor = prefixXor ^ val[node];
        int newBeauty = beauty;
        HashMap<Integer, Boolean> newSeen;

        if (seen.containsKey(newXor)) {
            // Found zero-XOR subpath, greedily take it
            newBeauty++;
            newSeen = new HashMap<>();
            newSeen.put(0, true);
            newXor = 0;
        } else {
            newSeen = new HashMap<>(seen);
            newSeen.put(newXor, true);
        }

        // Add beauty for every node (every root-to-node path)
        result[0] += newBeauty;

        for (int child : children[node]) {
            dfs(child, newSeen, newXor, newBeauty, result);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine().trim());
        List<Integer> par = new ArrayList<>(n);
        for(int j=0; j<n; j++) {
            par.add(Integer.parseInt(scan.nextLine().trim()));
        }
        List<Integer> a = new ArrayList<>(n);
        for(int j=0; j<n; j++) {
            a.add(Integer.parseInt(scan.nextLine().trim()));
        }
        long result = calculatePathsBeauty(n, par, a);
        System.out.println(result);
    }
}