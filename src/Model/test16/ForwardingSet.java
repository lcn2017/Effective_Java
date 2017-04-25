package Model.test16;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/*
        复合大于继承，继承有可能会暴露类本身的缺陷。复合即在类中维护这个类调用这个类的方法，那么超类代码的更改也无法影响
你的代码。其实就是装饰设计模式。只有当A类就是B类时我们才使用继承。
 */
public class ForwardingSet<E> implements Set<E> {
	private final Set<E> s;

	public ForwardingSet(Set<E> s) {this.s = s;}

	@Override
	public int size() {return s.size();}
	@Override
	public boolean isEmpty() {return s.isEmpty();}
	@Override
	public boolean contains(Object o) {return s.contains(o);}
	@Override
	public Iterator<E> iterator() {return s.iterator();}
	@Override
	public Object[] toArray() {return s.toArray();}
	@Override
	public <T> T[] toArray(T[] a) {return s.toArray(a);}
	@Override
	public boolean add(E e) {return s.add(e);}
	@Override
	public boolean remove(Object o) {return s.remove(o);}
	@Override
	public boolean containsAll(Collection<?> c) {return s.contains(c);}
	@Override
	public boolean addAll(Collection<? extends E> c) {return s.addAll(c);}
	@Override
	public boolean retainAll(Collection<?> c) {return s.retainAll(c);}
	@Override
	public boolean removeAll(Collection<?> c) {return s.removeAll(c);}
	@Override
	public void clear() {s.clear();}
}
