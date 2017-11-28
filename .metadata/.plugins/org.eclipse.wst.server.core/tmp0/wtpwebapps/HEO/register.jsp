
<%@include file="/WEB-INF/views/header.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="am-g am-g-fixed login">
	<div class="am-u-md-8 am-u-md-offset-2">
		<form action="${pageContext.request.contextPath}/addUser.do" class="am-form" id="doc-vld-msg">
			<fieldset>
				<legend>注册</legend>
				<div class="am-form-group">
					<label for="doc-vld-name">用户名：</label> <input type="text"
						id="doc-vld-name" placeholder="输入用户名（少于10个字符）" maxlength=10
						required data-validation-message="请输入用户名!" name="userName" />
				</div>

				<div class="am-form-group">
					<label for="doc-vld-email">邮箱：</label> <input type="email"
						id="doc-vld-email" data-validation-message="请输入正确的邮箱"
						placeholder="请输入邮箱" required  name="email"/>
				</div>

				<div class="am-form-group">
					<label for="doc-vld-pw">请输入密码：</label> <input type="password"
						id="doc-vld-pw" placeholder="请输入密码" required
						data-validation-message="请输入密码！" name="password" />
				</div>

				<div class="am-form-group">
					<label for="doc-vld-pw-2">确认密码：</label> <input type="password"
						id="doc-vld-pw-2" placeholder="请与上面输入的值一致"
						data-equal-to="#doc-vld-pw" required
						data-validation-message="与上面的密码不一致！" />
				</div>

				<div class="am-g am-g-fixed login-center">
					<button class="am-btn am-btn-secondary am-round" type="submit">注册</button>
				</div>
			</fieldset>
		</form>
	</div>
</div>


<script type="text/javascript">
  	$(function() {
  	  $('#doc-vld-msg').validator({
  	    onValid: function(validity) {
  	      $(validity.field).closest('.am-form-group').find('.am-alert').hide();
  	    },

  	    onInValid: function(validity) {
  	      var $field = $(validity.field);
  	      var $group = $field.closest('.am-form-group');
  	      var $alert = $group.find('.am-alert');
  	      // 使用自定义的提示信息 或 插件内置的提示信息
  	      var msg = $field.data('validationMessage') || this.getValidationMessage(validity);

  	      if (!$alert.length) {
  	        $alert = $('<div class="am-alert am-alert-danger"></div>').hide().
  	          appendTo($group);
  	      }

  	      $alert.html(msg).show();
  	    }
  	  });
  	});
</script>








<%@include file="/WEB-INF/views/footer.jsp"%>