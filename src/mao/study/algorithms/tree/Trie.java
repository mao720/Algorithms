package mao.study.algorithms.tree;

/**
 * 前缀树
 * Trie（发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。
 * 这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 */
public class Trie {
    private final Node node;

    private static class Node {
        Node[] children = new Node[96];
        boolean isEnd = false;
    }

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        node = new Node();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        Node cur = node;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - ' ';
            if (cur.children[index] == null) {
                cur.children[index] = new Node();
            }
            cur = cur.children[index];
        }
        cur.isEnd = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        Node res = searchNode(word);
        return res != null && res.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        return searchNode(prefix) != null;
    }

    public Node searchNode(String s) {
        Node cur = node;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - ' ';
            if (cur.children[index] == null) {
                return null;
            }
            cur = cur.children[index];
        }
        return cur;
    }
}
