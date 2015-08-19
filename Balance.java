import java.util.*;

public class Balance {
	
	public boolean isBalance(TreeNode root)
	{
		if(root == null)
			return true;
		else {
			int left = getHeight(root.left);
			int right = getHeight(node.right);
			if(Math.abs(left - right) <= 1)
				return isBalance(root.left)&&isBalance(root.right);
			else {
				return false;
			}
		}
	}

	public static int getHeight(TreeNode node)
	{
		if(node == null)
			return 0;
		else {
			int left = getHeight(node.left);
			int right = getHeight(node.right);
			return (left > right)?(left+1):(right+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
