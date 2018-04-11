package xiaoanjie;

import java.util.Iterator; //��������Ҫ�õ�

public interface Graph{
	
public static final int UndirectedGraph = 0; //����ͼ
public static final int DirectedGraph = 1;   //����ͼ

//����ͼ�����ж���
public Iterator getNodes();

//����ͼ�����б�
public Iterator getEdges();

//����ͼ������
public int getType();


//����ͼ�Ķ�����
public int getNode();


//ɾ��һ������v
public void remove(Node n);

//���һ������v
public Node insert(Node n);

//����أ�E��
//����ͼ�ı���
public int getEdgeNum();


//ɾ��һ����e
public void remove(Edge e);

//���һ����e
public Node insert(Edge e);

//�ж϶���u��v�Ƿ����
public boolean areAdjacent(Node u,Node v);

//���ش�uָ��v�ıߣ������ھͷ���NULL
public Edge edgeFromTo(Node u,Node v);

//���ش�u��������ֱ�ӵ�����ڽӶ���
public Iterator adjVertexs(Node u);

//��ͼ����������ȱ���
public Iterator DFST(Node v);

//��ͼ���й�����ȱ���
public Iterator BFSTraverse(Node v);

//�󶥵�v��������������·��
//public Iterator shortestPath(Vertex v);









	
	
	
	
	
}
