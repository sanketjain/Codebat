import java.util.*;

public class AverageLevel{
	public List <Double> averageOfLevels(TreeNode root) {
		List<Double> sum = new ArrayList<>();
		List<Integer> count = new ArrayList<>();
		average(root, 0, sum, count);
		for(int index=0; index<sum.size(); index++){
			sum.set(index, sum.get(index)/count.get(index));
		}
		return sum;
	}

//	public List <Double> average(TreeNode n, int i, List<Double> sum, List<Integer> count){
	public void average(TreeNode n, int i, List<Double> sum, List<Integer> count){
		if(n==null) return;
//		if(sum.get(i)==null){
		 if (i < sum.size()) {
			sum.set(i, sum.get(i)+n.data);
			count.set(i, count.get(i)+1);
		} else {
			sum.add(n.data * 1.0);
//			count.add(1.0);
			count.add(1);
		}
		average(n.left, i+1, sum, count);
		average(n.right, i+1, sum, count);
	}

}