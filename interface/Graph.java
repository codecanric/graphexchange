package xiaoanjie;

import java.util.Iterator; //迭代器需要用到

public interface Graph{
	
public static final int UndirectedGraph = 0; //无向图
public static final int DirectedGraph = 1;   //有向图

//返回图的所有顶点
public Iterator getNodes();

//返回图的所有边
public Iterator getEdges();

//返回图的类型
public int getType();


//返回图的顶点数
public int getNode();


//删除一个顶点v
public void remove(Node n);

//添加一个顶点v
public Node insert(Node n);

//边相关（E）
//返回图的边数
public int getEdgeNum();


//删除一条边e
public void remove(Edge e);

//添加一条边e
public Node insert(Edge e);

//判断顶点u，v是否领接
public boolean areAdjacent(Node u,Node v);

//返回从u指向v的边，不存在就返回NULL
public Edge edgeFromTo(Node u,Node v);

//返回从u出发可以直接到达的邻接顶点
public Iterator adjVertexs(Node u);

//对图进行深度优先遍历
public Iterator DFST(Node v);

//对图进行广度优先遍历
public Iterator BFSTraverse(Node v);

//求顶点v到其它顶点的最短路径
//public Iterator shortestPath(Vertex v);









	
	
	
	
	
}
