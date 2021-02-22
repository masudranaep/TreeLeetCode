
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return " ";
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        return sb.toString().trim();
    }
    private void dfs(TreeNode root, StringBuilder sb){
        if(root == null) return;
        sb.append(root.val + " ");
        dfs(root.left, sb);
        dfs(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    if(data.isEmpty()) return null;
        String[] s = data.split(" ");
    return constructBST(s,0,s.length -1);
    }
    private TreeNode constructBST(String[] s, int start, int end){
        if(start > end) return null;
        TreeNode root = new TreeNode(Integer.parseInt(s[start]));
        int index;
        for(index = start; index <= end; index++){
            if(Integer.parseInt(s[index]) > Integer.parseInt(s[start]))
                break;
        }
        root.left = constructBST(s,start +1,index - 1);
        root.right = constructBST(s,index,end);
        return root;
    }
}
