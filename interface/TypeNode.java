package xiaoanjie;

import java.util.Iterator;

//����ͼ ����ӿ�

public interface TypeNode extends Node,NamedElement{

	public Iterator getSuperTypes(); //��ȡ����

	public Iterator getAttributes(); //��ȡ����
}
