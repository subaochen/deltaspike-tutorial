# 演示deltaspike如何控制页面的访问权限

基本的步骤是：

1, 继承AbstractAccessDecisionVoter实现高级的Deltaspike用户验证
2, 在View Config中使用@Secured(CustomerAccessDecisionVoter.class)实现对页面的访问控制
