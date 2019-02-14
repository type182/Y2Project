package com.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Util.SerialiZableUtil;
import com.Util.TypeRedis;
import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
@Service
public class RedisService {
	@Autowired
	JedisPool jedisPool;
	public Jedis GetJedis() {
		return jedisPool.getResource();
	}
	
	/**
	 * 
	 * @param key  键
	 * @param value 值
	 * @param time 时间
	 * @return 是否添加String成功
	 */
	public boolean SetString(String key,String value,Long time) {
		Jedis getJedis = GetJedis();
		try {
			if (time!=null) {
				getJedis.set(key, value, "NX", "EX",time);
			}else {
				getJedis.set(key, value);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			getJedis.close();
		}
	}
	
	/**
	 * 
	 * @param key
	 * @return 获取String 类型
	 */
	public String GetString(String key) {
		Jedis getJedis = GetJedis();
		try {
			String string = getJedis.get(key);
			return string;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			getJedis.close();
		}
	}
	
	
	
	/**
	 * 
	 * @param key  添加的key
	 * @param value 添加的值 Pojo
	 * @param time 添加存在的时间
	 * @return 是否添加成功
	 */
	public boolean Set(String key,Object value,Long time) {
		try {
			
			System.out.println(jedisPool);
			Jedis jedis = jedisPool.getResource();
			String objvalue = SerialiZableUtil.SerializableEncode(value);
			if (time==null) {
				jedis.set(key, objvalue);
			}else {
				jedis.set(key, objvalue, "NX", "EX", time);
			}
			jedis.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	/**
	 * 
	 * @param key  键
	 * @return  序列化得类
	 */
	public Object Get(String key) {
		Jedis getJedis = GetJedis();
		try {
			String string = getJedis.get(key);
			Object serializableDecode = SerialiZableUtil.SerializableDecode(string);
			return serializableDecode;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		finally {
			getJedis.close();
		}
		
		
	}
	
	
	/**
	 * 
	 * @param key 
	 * @param value
	 * @return 传统的StringSet
	 */
	public boolean SetListNew(String key,List<String> value) {
		Jedis getJedis = GetJedis();
		try {
			String[] strings=new String[value.size()];
			for (int i = 0; i < strings.length; i++) {
				strings[i] = value.get(i);
			}
			getJedis.lpush(key, strings);
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			getJedis.close();
		}
	}
	
	/**
	 * 
	 * @param key 
	 * @param value
	 * @param tiem 时间
	 * @return 存活时间添加list
	 */
	public boolean SetListNew(String key,List<String> value,Long time) {
		Jedis getJedis = GetJedis();
		try {
			String[] strings=new String[value.size()];
			for (int i = 0; i < strings.length; i++) {
				strings[i] = value.get(i);
			}
			getJedis.lpush(key, strings);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			getJedis.close();
		}
	}
	
	
	
	/**
	 * 
	 * @param key
	 * @param size
	 * @return 传统的String获取
	 */
	public List<String> GetListindex(String key,int size) {
		Jedis getJedis = GetJedis();
		try {
			List<String> blpop = getJedis.blpop(size, key);
			return blpop;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			getJedis.close();
		}
	}
	
	/**
	 * 
	 * @param key  key
	 * @param begin  开始下标
	 * @param end    结束下标
	 * @return  查询得到的list集合
	 */
	public List<String> GetList(String key,Integer begin,Integer end) {
		Jedis getJedis = GetJedis();
		try {
			List<String> blpop = getJedis.lrange(key,((begin==null)?0:begin),((end==null)? -1 :end));
			return blpop;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			getJedis.close();
		}
	}
	
	
	
	
	/**
	 * 
	 * @param key
	 *  通用删除
	 */
	public void deleListlast(String key) {
		Jedis getJedis = GetJedis();
		try {
			String lpop = getJedis.lpop(key);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			getJedis.close();
		}
	}
	/**
	 * 
	 * @param key
	 * @param list
	 * @return  用户操作Pojo类的添加
	 */
	public boolean SetPojoList(String key,List list,TypeRedis redis){
		Jedis getJedis = GetJedis();
		try {
			String[] strings = new String[list.size()];
			for (int i = 0; i < strings.length; i++) {
				if (redis==TypeRedis.JSON) {
					strings[i] = JSON.toJSONString(list.get(i));
				}else if(redis==TypeRedis.Serializable) {
					strings[i] = SerialiZableUtil.SerializableEncode(list.get(i));
				}
			}
			getJedis.lpush(key, strings);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally {
			getJedis.close();
		}
	}
	
	
	/**
	 * 
	 * @param key
	 * @param size 是可选的 null不选他  根据下表去出指定
	 * @return  读取pojo类
	 */
	public List GetPojoList(String key,Integer size,Integer begin,Integer end) {
		try {
			List<String> getList = null;
			if (size==null) {
				getList = GetList(key,begin,end);
			}else {
				getList = GetListindex(key, size);
			}
			List<Object> obc = new ArrayList<>();
			for (String st : getList) {
				obc.add(SerialiZableUtil.SerializableDecode(st));
			}
			return obc;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}

	/**
	 * 
	 * @param index  要删除的下标
	 * @param key 
	 * @return  是否删除成功
	 */
	public boolean DeleteList(int index,String key) {
		Jedis getJedis = GetJedis();
		
		try {
			getJedis.lrem(key, index, getJedis.lindex(key, index));
			return true;
		} catch (Exception e) {
			return false;
		}finally {
			getJedis.close();
		}
		
		
	}
	
	/**
	 * 
	 * @param index  修改的下标
	 * @param value  修改的value
	 * @param key  修改的key
	 * @return  是否修改成功
	 */
	public boolean UpdataList(int index,String value,String key) {
		Jedis getJedis = GetJedis();
		try {
			getJedis.lset(key, index, value);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		finally {
			getJedis.close();
		}
	}
	
	
	/**
	 * 
	 * @param key 获取长度的key
	 * @return 返回指定集合长度
	 */
	public long listsize(String key) {
		Jedis getJedis = GetJedis();
		try {
			Long llen = getJedis.llen(key);
			return llen;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}finally {
			getJedis.close();
		}
	}
}
