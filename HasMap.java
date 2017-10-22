package nl.aegon.assessment.cases.helpers;

import java.util.HashMap;
import java.util.Map;

public class HasMap<K, V> extends HashMap<K, V> implements Map<K, V>
{
   /**
    * <code>serialVersionUID</code> indicates/is used for.
    */
   private static final long serialVersionUID = 6401862082671079797L;
   private int usingGet;

	System.out.println("Merge conflict resolved between feature1 version in dev branch and feature2version we are trying to checkin");

   /*
    * (non-Javadoc)
    * @see java.util.HashMap#get(java.lang.Object)
    */
   @Override
   public V get(Object key)
   {
      usingGet++;
      return super.get(key);
   }

   /**
    * Get the usingGet.
    * 
    * @return Returns the usingGet as a int.
    */
   public int getUsingGet()
   {
      return usingGet;
   }
}
