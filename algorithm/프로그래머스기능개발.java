import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 프로그래머스기능개발 {
    public static List solution(int[] progresses, int[] speeds) {
    	Queue<Integer> q = new LinkedList<>();
    	for(int i=0;i<progresses.length;i++){
    		q.add((int) Math.ceil((100.0-progresses[i])/speeds[i]));
    	}
    	
    	List<Integer> answer = new ArrayList<>();
    	
    	while(!q.isEmpty()){
    		int day = q.poll();
    		int cnt = 1;
    		
    		while(!q.isEmpty() && day >= q.peek()){
    			cnt++;
    			q.poll();
    		}
    		answer.add(cnt);
    	}
        
        return answer;
    }
}
