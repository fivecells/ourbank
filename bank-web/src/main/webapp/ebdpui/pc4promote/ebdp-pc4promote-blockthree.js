/**
 * ��Ϣ�鹹���������ı�����
 */
var BlockThree = (function(){
	
	function _blockthree(id) {
		
		
	    var that = this;
	    
		/**
		 * ����¼�
		 */
		function _unbindEvent() {}
		
		/**
		 * ���¼�
		 */
		function _bindEvent() {}
		
		/**
		 * �ж��Ƿ���Ҫҳ�������֮����ִ��show
		 * @return boolean
		 */
		function _isAfterLoad() {
			return Util.prototype.isIE() && (parseInt(jQuery.browser.version,10)<8||Util.prototype.isQuirkMode());
		}
		
		/**
		 * ִ��show������
		 */
		function _executeShowBody() {
			
		}
		
		/**
		 * ��ǰ���չ�ֽ�����۴���
		 */
		this.show = function(){
			if(_isAfterLoad()) {
				jQuery(function(){
					_executeShowBody();
				});
			}else {
				_executeShowBody();
			}
		};
	};
	
	return _blockthree;
})();