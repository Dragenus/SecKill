# ��Ʒ��ɱϵͳ
### һ����������
- ���Ŀ�ܣ�SpringBoot
- ��Ŀ������jdk1.8��Maven
- �־ò��ܣ�Mybatis
- ģ���ܣ�Thymeleaf
- ���ݿ⣺MySQL 5.7
- ��Ϣ���У�RabbitMQ
- ���棺Redis

### ������������
- **��������**   
�����ص�����ɱ����ʵ�ֺ��Ż���δ��ƹ���Ա���ܣ�������棬������Ʒ���޸���Ʒ��Ϣ�ȣ�
1. ʵ���û���¼���ܣ�����MD5���ܣ��û��ˣ�PASS=MD5(����+�̶�+Salt)������ˣ�PASS=MD5(�û�����+���Salt)
2. ��Ʒҳ�棬�鿴��Ʒ���鿴��Ʒ����
3. ������ɱ��������ɱ����

- **��ɱ�߼�**
1. ϵͳ���ݳ�ʼ������Redis�д�����Ʒ���
2. �յ���ɱ�����ж���ɱ��ʶ������ɱ��Redis����棬����ֱ�ӷ���
3. ������ӣ����ؽ�������Ŷ�
4. ������ӣ����ɶ��������ݿ����
5. �ͻ��˽����ѯ

- **�����Ż�**
1. ҳ�滺�桢�û���Ϣ���桢ϵͳ���ݳ�ʼ��
2. ����RabbitMQ�������������
3. ��ɱΨһ��ʶ+RedisԤ��������ٶ����ݿ����
4. ���ض������ɽӿڵ�ַ����������ע��
### ������ĿĿ¼
![Ŀ¼.PNG](src/main/resources/static/img/show/Ŀ¼.png)
### �ġ����ݿ����
#### 1.���ݱ�

- ��Ʒ�б�goods
- ��ɱ��Ʒ�б�miaosha_goods
- ��ɱ������miaosha_order
- �û���Ϣ��miaosha_user
- ���������order_info
#### 2.��ṹ
**��Ʒ�б�**
![��Ʒ.PNG](src/main/resources/static/img/show/shangpin.png)

**��ɱ��Ʒ**
![��ɱ��Ʒ.PNG](src/main/resources/static/img/show/msshangpin.png)

**��ɱ����**  
�����ֶ�`user_id`, `goods_id`
![��ɱ����.PNG](src/main/resources/static/img/show/msorder.png)

**�û���Ϣ**
![��ɱ�û�.PNG](src/main/resources/static/img/show/user.png)

**��������**
![��������.PNG](src/main/resources/static/img/show/dingdan.png)
