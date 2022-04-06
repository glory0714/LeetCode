//用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead操作返回 -1 )
/*输入：
        ["CQueue","appendTail","deleteHead","deleteHead"]
        [[],[3],[],[]]
        输出：[null,null,3,-1]
*/

import java.util.Stack;

class CQueue09 {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    public CQueue09() {
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if(s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            if(s2.isEmpty()){
                return -1;
            }else{
                return s2.pop();
            }
        }else{
            return s2.pop();
        }
    }
}