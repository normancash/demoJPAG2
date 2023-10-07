package service;

import java.util.List;

public interface IDAO {

   <T> List<T> getAll(String namedQuery, Class clazz);
}
