package mao.study.algorithms.search;

import java.util.Deque;
import java.util.LinkedList;

public class BreathFirstSearch {
    private static void bfs() {
        Deque<Object> deque = new LinkedList<>();
        deque.push(new Object());
        while (!deque.isEmpty()) {
            int length = deque.size();
            for (int i = 0; i < length; i++) {
                Object o = deque.poll();
                //下一层
                //deque.push(XXXX);
            }
        }
    }

    public static void main(String[] args) {
        //BFS
        bfs();
    }
}
