package Java;

import java.awt.font.OpenType;
import java.util.ArrayList;
import java.util.Iterator;

public class SOList<Type> implements Iterable<Type> 
{

    private Type[] arrayList;
    private int currentSize;

    public SOList(Type[] newArray) 
    {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }
    public Iterator<Type> iterator() 
    {
        Iterator<Type> it = new Iterator<Type>() 
        {
        	private int currentIndex = 0;
            public boolean hasNext() 
            {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }
            public Type next() 
            {
                return arrayList[currentIndex++];
            }
            public void remove() 
            {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
	public char[] next() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
class Sample___
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> s = new ArrayList<Integer>();
		s.add(45);
		s.add(48);
		s.add(85);
		@SuppressWarnings("unchecked")
		SOList<OpenType> l=(SOList<OpenType>) s.iterator();
		System.out.println(l.next());
		
	}
}