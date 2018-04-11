package xiaoanjie;
//类型图的边 接口定义

public interface TypeEdge extends Edge,NamedElement{
	
	public boolean isContainment();        //是否包含

	public boolean isMany();               //
	
}
