 // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null) return "X";
        String leftserialize = serialize(root.left);
        String rightserialize = serialize(root.right);
        return root.val+","+leftserialize+","+rightserialize;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[] = data.split(",");
        Queue<String> q = new LinkedList<>();
        for(int i = 0; i < arr.length; i++)
            q.add(arr[i]);
        TreeNode root = deserialize(q);
        return root;
    }
    private static TreeNode deserialize(Queue<String> q){
        if(q.size() == 0) return null;
        String peek = q.poll();
        if(peek.equals("X"))  return null;
        TreeNode root = new TreeNode(Integer.parseInt(peek));
        root.left = deserialize(q);
        root.right = deserialize(q);
        return root;
   