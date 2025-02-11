class Subsets {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        recurse(nums, 0, new ArrayList<>());
        return result;
    }

    private void recurse(int[] nums, int index, List<Integer> path){

        result.add(new ArrayList<>(path));

        for(int i=index; i<nums.length; i++){
            path.add(nums[i]);
            recurse(nums, i+1, path);
            path.remove(path.size() - 1);
        }
    }
}
