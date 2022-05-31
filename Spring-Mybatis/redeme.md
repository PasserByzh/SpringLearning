mybatis 使用步骤，
1. 定义dao接口，studentDao
2. 定义mapper文件，StudentDao.xml
3. 定义mybatis的主配置文件 mybatis.xml
4. 创建dao的代理对象,StudentDao dao = SqlSession.getMapper(StudentDao.class);
    List<Student> students = dao.selectStudents();

需要使用dao对象，需要使用getMapper()方法
怎么能使用getMapper()方法，需要那些条件
1. 获取SqlSession对象，需要使用SqlSessionFactory的openSession()方法
2. 创建SqlSessionFactory对象。通过读物mybatis的主配置文件，能创建SqlSessionFactory对象



Spring 和 mybatis集成
1. 加入依赖
1)Spring 依赖
2)mybatis 依赖
3)mysql驱动
4)Spring的事务依赖
5)mybatis和Spring集成的依赖: mybatis 官方提供的，用来在Spring项目中创建mybatis的SqlSessionFactory,dao对象的
2. 创建实体类
3. 创建到接口和mapper文件
4. 创建mybatis主配置文件
5. 创建service接口和实现类，属性是dao
6. 创建Spring的配置文件：声明mybatis 的对象交给spring创建
   1）数据源
   2）SqlSessionFactory
   3) Dao对象
   4) 声明自定义的service
7. 创建测试类，获取service对象，通过service调用dao完成数据库访问





