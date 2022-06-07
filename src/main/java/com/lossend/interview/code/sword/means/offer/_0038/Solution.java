package com.lossend.interview.code.sword.means.offer._0038;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] permutation(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        StringBuilder builder = new StringBuilder();
        boolean[] visited = new boolean[s.length()];
        List<String> total = new ArrayList<>();
        dfs(chars, 0, builder, visited, total);
        return total.toArray(total.toArray(new String[0]));
    }

    public void dfs(char[] chars, int index, StringBuilder builder, boolean[] visited,List<String> total) {
        if (index == chars.length) {
            total.add(builder.toString());
            return;
        }
        for (int i = 0; i < chars.length; i++) {
           if(visited[i] || (i > 0 && chars[i-1] == chars[i]) && !visited[i - 1])  {
               continue;
           }
           visited[i] = true;
           builder.append(chars[i]);
           dfs(chars, index+1, builder, visited, total);
           builder.deleteCharAt(index);
            visited[i] = false;
        }
    }
}
