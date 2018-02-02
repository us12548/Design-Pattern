package Filter;

import java.util.List;

//第一个筛选结果的基础上再次进行第二次筛选，即数据库的And查询
public class AndCriteria implements Criteria {

   private Criteria criteria;
   private Criteria otherCriteria;

   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }

   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);        
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}
