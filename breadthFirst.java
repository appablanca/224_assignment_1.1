import java.util.*;



public class breadthFirst {
    public static boolean[] marked;
    public static int[] edgeTo;
    public static int[] distTo;

    public breadthFirst(Graph G, int s,int tar,int flightTime){
        marked = new boolean[G.V];
        edgeTo = new int[G.V];
        distTo = new int[G.V];
        Arrays.fill(marked, false);
        bfs(G,s,tar,flightTime);
    }

    public static void bfs(Graph G, int s,int tar,int flightTime){
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(s);
        marked[s] = true;
        distTo[s] = 0;
        while(!q.isEmpty()){
            int v = q.poll();
            for(int w : G.adj(v)){
                if(!marked[w]){
                    edgeTo[w] = v;
                    G.time += flightTime;
                    distTo[w] = distTo[v] + 1;
                    marked[w] = true;
                    if (w == tar) return;
                    q.offer(w);
                }
            }
        }
        










    }

    
    
}
