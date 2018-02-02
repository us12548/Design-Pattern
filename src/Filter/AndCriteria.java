package Filter;

import java.util.List;

//��һ��ɸѡ����Ļ������ٴν��еڶ���ɸѡ�������ݿ��And��ѯ
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
