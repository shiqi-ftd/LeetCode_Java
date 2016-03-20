// One Pass Solution
public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];

        for (int i = 0; i < prerequisites.length; i++) {
                indegree[prerequisites[i][0]]++;
            }
        Queue<Integer> current = new LinkedList<Integer>();
        
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) current.offer(i);
        }
        
        while (current.size() > 0) {
            int courseId = current.poll();
            for (int i = 0; i < prerequisites.length; i++) {
                if (prerequisites[i][1] == courseId) {
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]] == 0) {
                        current.offer(prerequisites[i][0]);
                    }
                }
            }
        }
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] > 0) return false;
        }
        return true;
    }
}