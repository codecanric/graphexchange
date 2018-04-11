package xiaoanjie;

import java.util.Iterator;

//类型图 顶点接口

public interface TypeNode extends Node,NamedElement{

	public Iterator getSuperTypes(); //获取父类

	public Iterator getAttributes(); //获取属性
}
