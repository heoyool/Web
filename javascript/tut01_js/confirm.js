function register() {
    // 이거를 사용해도 됨.
    // confirm('회원가입을 하시겠습니까?');
    // true가 나왔을때 회원가입 페이지 이동 true는 생략가능
    // if(confirm('회원가입을 하시겟습니까?') == true) { 일때 true생략가능
        if(confirm('회원가입을 하시겟습니까?')) {
            location.href ="https://nid.naver.com/nidlogin.login?mode=form&url=https://www.naver.com/";

    }
}

function memberDelete(id){
    if(confirm(id  +'를 정말 삭제하시겠습니까 \n삭제하신 정보는 복구할 수 없습니다.'));
    location.href = "http://daum.net"
}