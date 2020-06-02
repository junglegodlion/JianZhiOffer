package com.jungle.JianZhiOffer;
// https://www.cnblogs.com/yongh/p/9866301.html

/**
 * 1.一般情况下，需要采用前/后序遍历和中序遍历才能确定一个二叉树，
 * 但是其实可以只采用前序遍历（从根结点开始），将空结点(null)输出为一个特殊符号（如“$”），就可以确定一个二叉树了。
 *
 *  　2.　将二叉树序列化为字符串，就是前序遍历的过程，遇见空结点时，序列化为“$”，每个结点间使用逗号分隔开。
 *
 * 　3.　将字符串反序列化为二叉树，也使用前序遍历，遇见一个新数字(或者$)就建立一个新结点，不过需要注意的是，
 * 数字可能不只是个位数字，因此创建了一个全局Int变量index（在字符串上的移动的指针），以便于截取字符串中当前的结点值。（详见代码）
 */
public class 序列化二叉树 {

//    链接：https://www.nowcoder.com/questionTerminal/cf7e25aa97c04cc1a68c8f040e71fb84?answerType=1&f=discussion
//    来源：牛客网

    int index = -1;
    /**
     * 分别遍历左节点和右节点，空使用#代替，节点之间，隔开
     *
     * @param root
     * @return
     */
    public String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        } else {
            return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
        }
    }
    /**
     * 使用index来设置树节点的val值，递归遍历左节点和右节点，如果值是#则表示是空节点，直接返回
     *
     * @param str
     * @return
     */
    TreeNode Deserialize(String str) {
        // String 转int 类型采用 int i = Integer.parseInt( s ); 不能用Integer.valueOf(s)，这返回的是Integer对象。
        String[] s = str.split(",");//将序列化之后的序列用，分隔符转化为数组
        index++;//索引每次加一
        int len = s.length;
        if (index > len) {
            return null;
        }
        TreeNode treeNode = null;
        if (!s[index].equals("#")) {//不是叶子节点 继续走 是叶子节点出递归
            treeNode = new TreeNode(Integer.parseInt(s[index]));
            treeNode.left = Deserialize(str);
            treeNode.right = Deserialize(str);
        }
        return treeNode;
    }
}
