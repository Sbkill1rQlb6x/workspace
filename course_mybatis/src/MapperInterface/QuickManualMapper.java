package MapperInterface;

import java.util.List;

import pojo.QuickManual;

public interface QuickManualMapper {
	
	public QuickManual findById(String id);
	public List<QuickManual> findAll();
	public void deleteById (String id);
}
