public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> levas1 = new ArrayList();
        List<Integer> levas2 = new ArrayList();
        
        dfs(levas1, root1);
        dfs(levas2, root2);
        return levas1.equals(levas2);
    }
    private void dfs(List<Integer> leafValue, TreeNode root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            leafValue.add(root.val);
        }
        dfs(leafValue, root.left);
        dfs(leafValue, root.right);
    }
}