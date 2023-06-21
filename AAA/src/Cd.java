
public class Cd {
	public static void main(String[] args) {

		String bn = "";
		boolean book_use = true;
		String book_cate, book_type, book_spec, book_cost, book_target, book_effect, book_spell = "";
		switch (bn) {
		case "긴급소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "가변";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 정령」을 한 개체 소환할 수 있다. ";
			book_spell = "향기로운 바람이여, 회답하는 이를 옮겨오라!";
			break;
		case "정령소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 1";
			book_target = "없음";
			book_effect = "정령 | 레벨1 | 원형 | 【블록2】\n지정특기 판정에 성공하면 「(특기명)의 정령」을 한 개체 소환할 수 있다.";
			book_spell = "만물을 이루는 이여, 그대의 자비를 보여다오!";
			break;
		case "마검소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 1";
			book_target = "없음";
			book_effect = "마검 | 레벨1 | 원형 | 【추가 대미지1】\n지정특기 판정에 성공하면 「(특기명)의 마검」을 한 개체 소환할 수 있다.";
			book_spell = "충절을 지켜라, 예리한 자여. 나의 목숨이 다할 때까지!";
			break;
		case "악몽소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 1";
			book_target = "없음";
			book_effect = "악몽 | 레벨1 | 원형 | 【마이너스2】\n지정특기 판정에 성공하면 「(특기명)의 악몽」을 한 개체 소환할 수 있다.";
			book_spell = "기어오라, 속삭이는 자. 탁한 미소는 독과 같으니!";
			break;
		case "기사소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 2";
			book_target = "없음";
			book_effect = "기사 | 레벨2 | 원형 | 【블록1】 【추가 대미지1】 【부스트1】\n지정특기 판정에 성공하면 「(특기명)의 기사」를 한 개체 소환할 수 있다.";
			book_spell = "명예를 바란 자여, 검과 방패를 맞부딪쳐라!";
			break;
		case "처녀소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 2";
			book_target = "없음";
			book_effect = "처녀 | 레벨2 | 원형 | 【블록1】 【캐스트】 【워드7】\n지정특기 판정에 성공하면 「(특기명)의 처녀」를 한 개체 소환할 수 있다.";
			book_spell = "춤추거라, 숨겨온 마음을 담아. 나에게 승리를 다오!";
			break;
		case "전차소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 2";
			book_target = "없음";
			book_effect = "전차 | 레벨2 | 원형 | 【블록2】 【마나1】 【플러스2】\n지정특기 판정에 성공하면 「(특기명)의 전차」를 한 개체 소환할 수 있다.";
			book_spell = "달려라, 앞지르는 자여. 그 등에 올라탄 이는 그대의 위대한 주인이니!";
			break;
		case "마왕소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 3";
			book_target = "없음";
			book_effect = "마왕 | 레벨3 | 원형 | 【블록2】 【추가 대미지2】 【부스트1】\n지정특기 판정에 성공하면 「(특기명)의 마왕」을 한 개체 소환할 수 있다.";
			book_spell = "고상하고도 천박하며 두려운 자여, 그대를 찬양하노라!";
			break;
		case "군단소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 3";
			book_target = "없음";
			book_effect = "군단 | 레벨3 | 원형 | 【블록3】 【추가 대미지1】 【워드7】\n지정특기 판정에 성공하면 「(특기명)의 군단」을 한 개체 소환할 수 있다.";
			book_spell = "가슴을 펴라, 용맹한 자여. 진격의 나팔 소리가 울려퍼진다!";
			break;
		case "왕국소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 4";
			book_target = "없음";
			book_effect = "왕국 | 레벨4 | 원형 | 【블록3】 【부스트2】 【캐스트】 【마나1】\n지정특기 판정에 성공하면 「(특기명)의 왕국」을 한 개체 소환할 수 있다.";
			book_spell = "열리거라, 왕국으로 통하는 길이여. 온 백성으로 손님을 대접하리라!";
			break;
		case "마신소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 5";
			book_target = "없음";
			book_effect = "마신 | 레벨5 | 원형 | 【블록3】 【추가 대미지3】 【부스트1】 【캐스트】 【플러스3】 【마이너스3】\n지정특기 판정에 성공하면 「(특기명)의 마신」을 한 개체 소환할 수 있다.";
			book_spell = "강림하소서, 위대한 이여. 나를 지켜주소서!";
			break;
		case "혈계소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "가변";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "자신의 【마력】을 1점 소비하고, 무작위로 특기 1개를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 기사」를 1개체 소환할 수 있다. 그 기사가 파괴 또는 소멸되면 이 마법을 사용한 자의 【마력】이 2점 감소한다.";
			book_spell = "내게 충성을 맹세한 자여, 피의 계약에 따라 즉시 달려오라!";
			break;
		case "분신소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "자기영역 1";
			book_target = "없음";
			book_effect = "자기 영역에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공했다면 자신이 남성일 경우 「(특기명)의 처녀」를, 여성일 경우 「(특기명)의 기사」를 한 개체 소환할 수 있다.";
			book_spell = "스쳐지나가라, 주마등이여. 그림자를 이루어라, 이상의 닮은 꼴이여";
			break;
		case "우상소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "힘";
			book_cost = "힘 1";
			book_target = "없음";
			book_effect = "자신의 입회인이 【마력】을 합계 3점 소비하면 사용할 수 있다. 「힘」 영역에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 마왕」을 한 개체 소환할 수 있다. 이 마왕은 소환된 라운드와 다음 라운드를 종료할 때 제거된다.";
			book_spell = "벗이 낳은 우신(偶神)이여, 단 한 가지 목적을 위해 살아 숨쉬는 동안 나를 도울지어다.";
			break;
		case "이경소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "이계";
			book_cost = "별 3";
			book_target = "없음";
			book_effect = "누적 불가\n지정특기 판정에 성공하면 「소환 저해」, 「주문 저해」, 「저항 저해」, 「전투 활성」, 「소환 혼란」, 「인과 불변」 중에서 세계 법칙을 하나 선택한다. 선택한 세계 법칙을 그 장면에 추가할 수 있다.";
			book_spell = "허무의 바다를 넘어 거대한 증기선이 왔도다. 머나먼 이경의 향기를 싣고서.";
			break;
		case "추상소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "추억";
			book_cost = "전 1";
			book_target = "없음";
			book_effect = "이 마법은 상흔이 있는 캐릭터만 습득할 수 있다. 자신의 【마력】을 1점 소비하고 지정특기 판정에 성공하면 「추억의 마왕」이나 「추억의 군단」을 소환할 수 있다.";
			book_spell = "운명이 앗아간 추억의 그대여. 고통과 함께 창을 열면, 변함 없는 그대와 해후하겠지.";
			break;
		case "공희":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "자신이 사역하는 원형 한 개체를 파괴한다. 자신이 습득한 소환 타입 마법 중에서 「원형을 소환」하는 효과의 마법을 하나 선택한다. 그 마법에 대응하는 원형이 한 개체 소환된다. 단, 소환할 수 있는 원형은 레벨이 이 마법으로 파괴된 원형의 레벨 이하인 것으로 제한된다.";
			book_spell = "이 슬픔을 그대에게 바치니, 시신을 넘어 이곳에 이르라!";
			break;
		case "대멸":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "본문 참조";
			book_effect = "자신이 사역하는 원형 한 개체를 선택한다. 그 원형에 대응하는 특기가 이 마법의 지정특기가 된다. 지정특기가 속한 분야의 오른쪽 옆 분야에 해당하는 영역에 속한 원형 한 개체를 목표로 선택한다 (「어둠」의 오른쪽 옆은 「별」인 것으로 간주하며, 혼의 특기에는 오른쪽이 존재하지 않는 것으로 본다). 지정특기 판정에 성공하면 목표를 파괴한다.";
			book_spell = "그대는 환상, 빛의 헛소리!";
			break;
		case "회귀":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "원한";
			book_cost = "힘 1";
			book_target = "캐릭터 1개체";
			book_effect = "자신이 사역하는 원형 한 개체를 선택한다. 그 원형을 파괴하고 지정특기 판정에 성공하면 목표의 【마력】을 해당 원형의 레벨+1만큼 회복한다.";
			book_spell = "돌아라, 회전목마. 끝없이 제자리를 도는 나의 여행은 아직도 계속되고 있도다.";
			break;
		case "성장":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "전 1";
			book_target = "정령 1개체";
			book_effect = "목표의 상징이 이 마법의 지정특기가 된다. 지정특기 판정에 성공하면 목표를 「(목표의 상징)의 기사」로 변화시킨다. 이때, 목표가 원래 입고 있던 대미지는 모두 없어진다.";
			book_spell = "영묘한 씨앗이여, 싹을 틔워라. 거목이 되어 꽃을 피워라!";
			break;
		case "검무":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "짐승";
			book_cost = "짐승 2";
			book_target = "마검 1개체";
			book_effect = "「짐승」 영역에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 목표를 「(지정특기)의 군단」으로 변화시킨다.";
			book_spell = "울어라, 망치여. 흩날려라, 불꽃이여. 수천 자루의 검이 춤출 때까지.";
			break;
		case "분해":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "어둠";
			book_cost = "어둠 1";
			book_target = "원형 1개체";
			book_effect = "「어둠」영역에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 목표를 파괴한다.";
			book_spell = "거짓된 환상이여, 산산이 부서져라.";
			break;
		case "습합":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "노래";
			book_cost = "노래 3";
			book_target = "레벨 2 이상인 자신의 원형 2개체";
			book_effect = "「노래」영역에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 목표의 상징 중 하나를 선택한다. 목표를 「(선택한 상징)의 마신」으로 변화시킨다. 이때, 목표가 원래 입고 있던 대미지는 모두 없어진다.";
			book_spell = "인과의 지평을 넘어, 두 개의 상(相)은 하나가 될 운명이니. 새로운 신이 탄생했도다.";
			break;
		case "복제":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "가변";
			book_cost = "꿈 Ⅹ";
			book_target = "적의 원형 1개체";
			book_effect = "목표의 상징이 지정특기가 된다. 목표의 레벨만큼 코스트를 소비할 수 있다면 지정특기 판정을 한다. 성공하면 목표와 같은 원형을 소환할 수 있다.";
			book_spell = "그대의 안에서 그림자가 잉크처럼 배어나오니, 그것이 그리는 것은 바로 그대.";
			break;
		case "천은":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자기 차례에 사용할 수 있다. 그 장면 동안 자신이 행동판정에서 어떤 특기를 대신 사용할 때, 특기 리스트의 「별」과 「어둠」 분야가 이어져 있는 것으로 간주한다.";
			book_spell = "터져라, 우주. 생각의 불이여, 무지의 암흑을 비춰라.";
			break;
		case "시편":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "정열";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "입회인\n누군가가 사건 표에서 주사위를 굴렸을 때 사용할 수 있다. 지정특기 판정에 성공하면 아무거나 마소 1점을 획득할 수 있다.";
			book_spell = "모든 것은 덧없도다. 하다못해 이 작은 불을 추억의 화로에 남겨두리.";
			break;
		case "복음":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "미소";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "입회인\n자기 앵커의 【운명】이 상승했을 때 사용할 수 있다. 지정특기 판정에 성공하면 자기 영역의 마소 1점과 임의의 마소 1점을 획득할  수 있다.";
			book_spell = "울려 퍼져라, 축복의 종소리. 운명의 노래와 함께.";
			break;
		case "연결":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "혼의특기";
			book_cost = "없음";
			book_target = "자신의 원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 「(이 주문을 사용한 자의 혼의 특기)의 (해당 원형의 카테고리)」로 변화하고, 【부스트 1】을 습득한다. 목표의 영역은 이 주문을 사용한 자와 같아지며, 원형이 혼의 특기를 사용하면 이 주문을 사용한 자의 【마력】이 감소한다.";
			book_spell = "나의 영맥으로 그 이름을 씻어내리라.";
			break;
		case "불꽃":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "전 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다.";
			book_spell = "불타라, 인과여!";
			break;
		case "역전":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "전 1";
			book_target = "없음";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 다음 라운드의 선공과 후공을 뒤바꿀 수 있다.";
			book_spell = "(지정 특기명)에 춤출지어다. 돌아라, 세계여.";
			break;
		case "지원":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "전 1";
			book_target = "없음";
			book_effect = "입회인\n자신 이외의 누군가가 판정을 할 때 사용할 수 있다. 그 판정에 +1의 수정을 적용할 수 있다.";
			book_spell = "티 없는 눈동자, 빛을 보리니.";
			break;
		case "보수":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "전 1";
			book_target = "자신의 원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 이 주문의 지정특기는 목표에 대응하는 특기다, 목표가 입은 대미지를 2점 회복한다.";
			book_spell = "무의식의 바다에서 온 자여, 다시 한 번 일어나 그 힘을 떨쳐라.";
			break;
		case "동요":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "전 1";
			book_target = "없음";
			book_effect = "입회인\n자신 이외의 누군가가 판정을 할 때 사용할 수 있다. 그 판정에 -1의 수정을 적용할 수 있다.";
			book_spell = "요동쳐라, 각인이여. 세상의 이치란 덧없는 것이니.";
			break;
		case "재도전":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "전 1";
			book_target = "자신";
			book_effect = "입회인\n자신이 판정에 실패했을 때 사용할 수 있다. 주사위를 다시 굴려 판정을 다시 할 수 있다. 이때, 목표치는 1점 상승하며, 또 실패하면 주사위 눈과 관계없이 펌블이 된다. 이 마법은 사용할 때마다 코스트가 1점 상승한다. 해당 세션에서 사용한 횟수를 메모해둬야 한다.";
			book_spell = "새는 날아간다. 안식을 얻을 때까지 이 날개는 꺾이지 않을 것이라며.";
			break;
		case "동조":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "전 X";
			book_target = "자신";
			book_effect = "자기 차례에 사용할 수 있다. 자신의 앵커를 한 명 선택한다. 그 앵커의 【운명】을 절반으로 나눈 만큼(나머지 올림) 코스트를 소비할 수 있다면, 다음에 자신이 시도하는 판정에 그 앵커의 【운명】 수치만큼 플러스 수정을 적용할 수 있다.";
			book_spell = "꿰뚫린 운명이여, 메아리쳐라.";
			break;
		case "교대":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "전 2";
			book_target = "자신의 입회인 1명";
			book_effect = "1회 제한: 마법전\n 마법전에서 라운드를 종료할 때 사용할 수 있다. 목표와 마법전의 대표 자리를 교대한다.";
			book_spell = "용을 그리고 눈동자를 빠뜨려, 이 농간을 미처 보지 못하니.";
			break;
		case "주구":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "전 1";
			book_target = "자신";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 지정특기가 속한 분야에서 무작위로 특기 하나를 선택한다. 그 특기를 습득한다. 이 효과는 그 장면을 종료할 때까지 지속된다.";
			book_spell = "깃들어라, 각인이여. 무지의 어둠에서 멀어져라.";
			break;
		case "허무의바늘":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "전 X";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 이 주문의 코스트는 주문을 사용하는 순간의 사용자의 【마력】과 같다. 코스트를 지급할 수 있다면 지정특기 판정을 한다. 성공하면 목표에게 1D6점의 대미지를 입힌다.";
			book_spell = "가느다란 그것은 나의 명맥. 꿰뚫어라!";
			break;
		case "무용":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "자기영역 1";
			book_target = "자신";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 그 라운드에 자신의 공격 스텝에서 공격이 성공했을 때, 자기 영역의 숫자에 대응하는 눈의 공격 주사위가 1개 이상 남아있다면 목표에게 【추가 대미지2】를 부여한다.";
			book_spell = "깃들어라, 진정한 용기여. 진실은 가공할 그림자로다.";
			break;
		case "활성":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "자기영역 2";
			book_target = "자신";
			book_effect = "자기 차례에 사용할 수 있다. 그 장면 동안 자기 영역의 특기가 지정특기인 모든 판정에 +1의 수정을 적용할 수 있다.";
			book_spell = "흐름을 멈춰라, 나의 (영역명)이여. 이곳은 세계의 근원일지니.";
			break;
		case "주술포":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "자기영역 2";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 자신의 영역에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 목표에게 3점의 대미지를 입힌다.";
			book_spell = "도려내라, 십자포화!";
			break;
		case "방벽":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "대지";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "자신이 한 번에 5점 이상 대미지를 입었을 때 사용할 수 있다. 지정특기 판정에 성공하면 그 대미지를 0으로 바꿀 수 있다.";
			book_spell = "완고한 자여, 나의 요새가 되어라!";
			break;
		case "침묵":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "정적";
			book_cost = "별 1";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 「봉인」 상태이상을 걸 수 있다. 또, 이 효과로 「봉인」에 걸린 목표는 「봉인」 상태이상을 회복할 때까지 주구 낭독 효과를 사용할 수 없게 된다(주구 규칙을 사용하지 않을 때는 무시한다).";
			book_spell = "듣지 않는다. 말하지 않는다. 영창하지 않는다.";
			break;
		case "마법방패":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "대지";
			book_cost = "별 1";
			book_target = "원하는 만큼의 원형";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드 동안 목표의 【추가 대미지】를 0으로 만든다. 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 목표만이 【추가 대미지】를 0으로 만드는 효과를 무효로 할 수 있다.";
			book_spell = "현실에 건너온 꿈, 이 일선을 넘지 못하리.";
			break;
		case "은혜로운비":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "비";
			book_cost = "별 2";
			book_target = "원하는 만큼의 캐릭터";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표 전원의 「봉인」과 「타짐」 상태이상을 회복할 수 있다.";
			book_spell = "달의 눈물. 별의 한숨.";
			break;
		case "용권":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "폭풍";
			book_cost = "별 3";
			book_target = "없음";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 그 장면 동안 해당 장면에 등장한 모든 캐릭터와 원형은 라운드를 종료할 때 《폭풍》 판정을 해야 한다. 실패한 자는 1점의 대미지를 입는다. 판정을 하는 순서는 이 마법의 사용자가 결정한다. 누군가의 【마력】이 0점이 되어도 아직 판정을 하지 않은 자는 전원 판정을 한다. 만약 양측의 대표가 모두 【마력】이 0이 되었다면 양쪽 모두 패배한다.";
			book_spell = "오라, 빼앗으며 조소하는 자!";
			break;
		case "환송":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "이계";
			book_cost = "별 X";
			book_target = "원형 1개체";
			book_effect = "마법전에서 자신의 소환 스텝에 사용할 수 있다. 목표의 레벨만큼 코스트를 소비하고, 지정특기 판정을 한다. 성공하면 목표를 파괴한다.";
			book_spell = "죽어서, 돌아가라. 무의식의 바다로.";
			break;
		case "나무갑옷":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "숲";
			book_cost = "별 X";
			book_target = "원하는 만큼의 캐릭터";
			book_effect = "드라마 장면에 사용할 수 있다. 목표의 수만큼 코스트를 소비하고, 지정특기 판정을 한다. 성공하면 목표는 【일시적 마력】을 2점 획득한다.";
			book_spell = "땅을 가르고 하늘까지 솟아라. 나를 수호하는 진수(鎭守)의 숲이여.";
			break;
		case "환희":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "에로스";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 자신이 사역하는 원형의 수만큼 아무거나 마소를 획득한다.";
			book_spell = "찰나! 접합! 섭리!";
			break;
		case "요화":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "꽃";
			book_cost = "짐승 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 자신이 사역하는 원형의 수만큼 대미지를 입힌다.";
			book_spell = "휘감아서 흐드러지게 꽃을 피우며 찢어 갈겨라, 재앙의 헛꽃이여!";
			break;
		case "벌레폭풍":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "벌레";
			book_cost = "짐승 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 그 라운드에 시도하는 모든 판정에 -1의 수정을 적용한다.";
			book_spell = "날벌레, 불쾌한 벌레, 짜증을 부르는 벌레. 모이고 에워싸 괴롭혀라!";
			break;
		case "변이":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "혼돈";
			book_cost = "짐승 1";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 무작위로 상태이상 하나를 걸 수 있다.";
			book_spell = "모든 생명은 곧 결함이 있노니. 살아라! 살아라!";
			break;
		case "비행":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "날개";
			book_cost = "짐승 2";
			book_target = "없음";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 그 장면 동안 해당 장면에 등장한 모든 캐릭터는 라운드를 종료할 때 《날개》 판정을 해야 한다. 실패한 자는 【마력】이 1점 감소한다. 판정을 하는 순서는 이 마법의 사용자가 결정한다. 누군가의 【마력】이 0점이 되어도 아직 판정을 하지 않은 자는 전원 판정을 한다. 만약 양측의 대표가 모두 【마력】이 0이 되었다면 양쪽 모두 패배한다.";
			book_spell = "날개짓하라! 태양을 향해 날아오른 이카로스처럼!";
			break;
		case "용린":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "비늘";
			book_cost = "짐승 2";
			book_target = "자신";
			book_effect = "1회 제한: 마법전\n 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전 동안 자신이 【일시적 마력】을 3점 획득한다.";
			book_spell = "각성하라, 옛 피의 기억.";
			break;
		case "교상":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "이빨";
			book_cost = "짐승 2";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 2점의 대미지를 입힐 수 있다.";
			book_spell = "피를 바라는 이빨, 내 욕망의 화신.";
			break;
		case "간파":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "빛";
			book_cost = "힘 1";
			book_target = "대표 1명";
			book_effect = "마법전을 할 때, 상대의 공격 스텝에서 플롯이 종료된 뒤에 사용할 수 있다. 지정특기 판정에 성공하면 이 마법의 사용자는 임의의 주사위 눈을 선언한다. 목표는 자신의 공격 주사위 중에 해당하는 눈이 있을 경우, 그 존재를 정직하게 밝혀야 한다.";
			book_spell = "어둠의 한 구석에 앉은 자여, 손을 들고 목소리를 높여라.";
			break;
		case "변천":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "흐름";
			book_cost = "힘 1";
			book_target = "대표 1명";
			book_effect = "마법전에서 방어측의 주사위가 공개된 뒤에 사용할 수 있다. 지정특기 판정에 성공하면 목표의 공격 주사위를 무작위로 1D6을 굴려서 변경한다.";
			book_spell = "운명, 타짐, 일곱 번의 위기. 나락, 일곱 쌍둥이, 악마의 아이.";
			break;
		case "탈출":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "바람";
			book_cost = "힘 1";
			book_target = "자신";
			book_effect = "입회인\n자신이 입회인이고 라운드를 종료할 때 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전의 입회인을 그만두고 해당 장면에서 퇴장할 수 있다. 또, 퇴장할 때 임의의 캐릭터에게 1점의 대미지를 입힐 수 있다.";
			book_spell = "이는 저속한 트릭. 오래되었지만 우수한 레토릭.";
			break;
		case "마탄":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "충격";
			book_cost = "힘 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다. 이 주문에 대해서는 저항판정을 할 수 없다.";
			book_spell = "별조차 쏴 맞히는 흉탄. 갈채를 보내라, 갈채를!";
			break;
		case "조류":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "파문";
			book_cost = "힘 2";
			book_target = "자신";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드 동안 자신이 주사위를 굴려서 홀수 눈이 나왔을 때 해당 수치에 1을 더한 주사위 눈이 나온 것으로 간주한다.";
			book_spell = "나는 붉은 달. 인과의 차로 빠짐을 유도하는 자.";
			break;
		case "화염구":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "불";
			book_cost = "힘 2";
			book_target = "2개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 각각 1점씩 대미지를 입힌다. 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 목표만이 대미지를 무효로 할 수 있다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "힘이여, 노래하라! 사자의 갈기처럼!";
			break;
		case "해방":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "자유";
			book_cost = "힘 2";
			book_target = "마법 사용자 1명";
			book_effect = "입회인\n원하는 타이밍에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 사용한 그 장면(마법전) 동안, 혹은 그 라운드 동안 지속되는 마법의 효과를 무효로 할 수 있다.";
			book_spell = "우레와 같은 박수, 끝을 알리는 종이 울렸도다. 새로운 무대를 위해 일동 해산!";
			break;
		case "공격기여":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "힘";
			book_cost = "힘 2";
			book_target = "캐릭터 1명";
			book_effect = "입회인\n자신이 입회인이고, 라운드를 종료할 때 사용할 수 있다. 「힘」 분야에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다.";
			book_spell = "열려라, 무궁한 문이여. 내 불멸의 축복과 유구한 한 마디를 전해다오.";
			break;
		case "핵격":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "불";
			book_cost = "힘 4";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자기 차례에서 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 4점의 대미지를 입힌다.";
			book_spell = "TIL TO WAIT. 질풍이여. 신의 불길을 해방하라!";
			break;
		case "폭격":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "충격";
			book_cost = "힘 X";
			book_target = "3개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 이 주문의 코스트는 사용할 때 1D6을 굴려 결정한다. 코스트를 지급할 수 있었다면 지정특기 판정을 한다. 성공하면 목표에게 3점의 대미지를 입힌다(대미지를 적용할 목표의 순서는 이 마법의 사용자가 결정한다) 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 목표만 대미지를 무효로 할 수 있다.";
			book_spell = "하늘이여, 갈라져 무너져라!";
			break;
		case "뇌격":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "우레";
			book_cost = "힘 X";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 소비한 코스트만큼 대미지를 입힌다.";
			book_spell = "울려라, 하늘이요! 공포에 떠는 자를 때려눕히리라!";
			break;
		case "박리":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "이별";
			book_cost = "노래 1";
			book_target = "없음";
			book_effect = "누적 불가\n 입회인 라운드를 개시할 때 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드 동안 마법의 코스트가 1점 상승한다(코스트가 없는 마법은 영향을 받지 않는다.). ";
			book_spell = "말라 비틀어진 나무드러럼. 벗겨져 떨어져라, 칠색의 빛.";
			break;
		case "마염":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "노래 1";
			book_target = "단일";
			book_effect = "마법전에서 자신이 방어에 성공했을 때(상대의 공격 주사위를 모두 제거했을 때) 사용할 수 있다. 목표에게 2점의 대미지를 입힌다.";
			book_spell = "타올라라, 양초에 마음을 빼앗겨 자기 몸을 태우는 벌레처럼.";
			break;
		case "송별":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "이별";
			book_cost = "노래 2";
			book_target = "원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표를 주권에서 제거한다. 단, 이 효과는 파괴나 소멸이 아니므로 제거된 원형을 다시 소환할 수 있다.";
			book_spell = "이것은 이별을 고하는 노래. 여기에서 여행을 마치기를.";
			break;
		case "추신":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "마음";
			book_cost = "노래 2";
			book_target = "본문 참조";
			book_effect = "마법전에서 자신이 누군가에게 대미지를 입혔을 때 사용할 수 있다. 지정특기 판정에 성공하면 대미지를 입힌 상대 중에서 1개체를 목표로 선택한다. 목표에게 1점의 대미지를 입히고, 자신이 사역하는 원형이 입은 대미지를 모두 회복할 수 있다.";
			book_spell = "나, 여기에 부족한 글솜씨로 넘쳐나는 마음을 써 내려가노라.";
			break;
		case "보복":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "시간";
			book_cost = "노래 2";
			book_target = "단일";
			book_effect = "마법전에서 자신이 방어 주사위로 상대의 공격 주사위를 제거했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에서 제거한 공격 주사위의 수만큼 대미지를 입힌다.";
			book_spell = "삐걱삐걱 째깍째깍 되감겨라. 여신은 곧 시계 장치로다.";
			break;
		case "독파":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "승리";
			book_cost = "노래 3";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정을 한다. 판정에 성공할 때마다 -1의 수정을 적용하고 이어서 한 번 더 판정할 수 있다. 이 판정을 독파 판정이라고 부른다. 독파 판정은 주문 사용 판정이 아니며, 【캐스트】의 효과나 주문 판정에 대한 수정은 이 판정에 영향을 주지 않는다. 독파 판정은 도중에 실패하지 않았다면 언제든지 판정을 멈출 수 있으며, 그 시점에서 목표에게 판정에 성공한 횟수(원래의 주문 판정과 독파 판정에 성공한 횟수의 합계)만큼 대미지를 입힌다. 한 번이라도 판정에 실패하면 아무 일도 일어나지 않는다.";
			book_spell = "열려라, 살색의 페이지. 모두 읽으면 나의 승리.";
			break;
		case "축복":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "치유";
			book_cost = "노래 X";
			book_target = "본문 참조";
			book_effect = "마법전에서 자기 차례일 때 사용할 수 있다. 지정특기 판정에 성공하면 소비한 코스트 수치와 같은 수까지 원형을 목표로 선택한다. 목표의 【블록】을 1점 상승시킨다(【블록】을 가지지 않은 원형에게는 효과가 없다).";
			book_spell = "구하라. 그러면 얻으리라.";
			break;
		case "회복":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "노래 X";
			book_target = "원하는 만큼의 캐릭터";
			book_effect = "드라마 장면에 사용할 수 있다. 지정특기 판정에 성공하면 목표의 【마력】을 [소비한 마소 수X3]점까지 회복할 수 있다. 회복하는 수치는 각 목표에 원하는 대로 배분할 수 있다.";
			book_spell = "이 세상에 노래가 있는 한, 우리는 죽지 않으리.";
			break;
		case "환영":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "환각";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "마법전에서 자신이 방어 주사위를 공개한 뒤에 사용할 수 있다. 지정특기 판정에 성공하면 자신의 방어 주사위 1개의 눈에 ±1을 적용할 수 있다.";
			book_spell = "헤매라, 어리석은 바보처럼. 보고 싶은 것만 보도록 해라!";
			break;
		case "마법의잠":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "잠";
			book_cost = "꿈 1";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 「허약」 상태이상을 걸 수 있다.";
			book_spell = "꿈에 취하는 진흙 속, 태아처럼 몸을 맡겨라.";
			break;
		case "책갈피":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "추억";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "선택: 드라마 장면/자신이 습득한 주문 타입 마법 1종류  선택한 마법에 필요한 코스트를 소비하고, 지정특기 판정을 해서 성공하면 그 이후 그 마법을 사용할 수 있는 타이밍이 되었을 때 한 번만 그 마법의 효과를 사용할 수 있다. 이 효과는 마법전에서 한 라운드에 1회만 주문을 사용할 수 있다는 제한에 영향을 받지 않으며, 지정특기 판정은 성공한 것으로 간주한다. 일단 【책갈피】를 사용하면 선택한 주문의 효과를 사용할 때까지는 【책갈피】를 사용할 수 없다.";
			book_spell = "기억 속 영혼의 실이여, 책의 옷깃을 장식하라.";
			break;
		case "책장인간":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "환각";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "마법전에서 자신이 방어 주사위를 공개한 뒤에 사용할 수 있다. 지정특기 판정에 성공하면 방어 주사위를 2개 더 굴릴 수 있다(이 방어 주사위는 플롯하지 않고, 무작위로 주사위 눈을 결정한다).";
			book_spell = "나의 표제여, 나의 문자여, 나의 행간이여. 나의 대리인으로서 책무를 다하라.";
			break;
		case "탄원":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "기도";
			book_cost = "꿈 2";
			book_target = "없음";
			book_effect = "입회인\n누군가가 운명의 힘을 사용해서 부활 판정을 할 때 사용할 수 있다. 지정특기 판정에 성공하면 해당 판정에 +2의 수정을 적용할 수 있다. ";
			book_spell = "위대한 인도의 불이여. 지금 시 순간, 저승의 강을 거슬러 올라가려는 그 자의 여행에 축복을.";
			break;
		case "현혹":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "불안";
			book_cost = "꿈 2";
			book_target = "단일";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 그 장면 동안 다른 특기를 대신 사용한 판정에 -1 수정을 적용해야 한다.";
			book_spell = "부풀린 음색, 휘청거리는 발부리.";
			break;
		case "복선":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "미래";
			book_cost = "꿈 3";
			book_target = "없음";
			book_effect = "1회 제한: 세션\n자신이 장면 플레이어인 드라마 장면일 때, 그 장면의 주요 행동을 하는 대신 사용할 수 있다. 지정특기 판정에 성공하면 자신은 그 장면에서 퇴장하고, 다음 장면 이후에 한 번만 자신 이외의 누군가가 실패한 판정을 성공으로 바꿀 수 있다(달성치가 필요하다면 10이 된다.).";
			book_spell = "정맥과 동맥으로 꿈에 뿌리를 내려라. 그것이 미래를 위한 포석. 역전의 에피그래프.";
			break;
		case "회상":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "추억";
			book_cost = "꿈 3";
			book_target = "캐릭터 1명";
			book_effect = "1회 제한: 세션\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표를 장면 플레이어로 하는 드라마 장면을 1회 열 수 있다.";
			book_spell = "옛날, 옛날, 뱀에게 손발이 있었던 시절.";
			break;
		case "촉매":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "심연";
			book_cost = "어둠 1";
			book_target = "적의 대표 1명";
			book_effect = "자신이 공격으로 적 대표의 【마력】을 감소했을 때 사용할 수 있다. 지정특기 판정에 성공하면 자신이 습득한 소환 마법을 하나 선택한다. 그 마법에 공격으로 목표가 감소한 【마력】만큼 코스트를 충전한다. 단, 이 효과로 그 마법에 충전할 수 있는 상한을 초과할 수는 없다.";
			book_spell = "피에 머무는 요람, 그 시중을 들며 대가를 얼버무리리.";
			break;
		case "죽음의선":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "죽음";
			book_cost = "어둠 1";
			book_target = "없음";
			book_effect = "마법전 중 자신의 공격 스텝에서 플롯을 하기 전에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드의 공격에서 방어 주사위에 의해 자신의 공격 주사위가 제거 된 후, 공격 주사위의 주사위 눈 숫자가 세 종류 이상 남아 있다면 상대의 【마력】을 0으로 만든다. 그 라운드를 종료할 때 상대가 패배하지 않았다면 이 마법의 사용자는 사망한다.";
			book_spell = "나, 죽음이 되어 생명을 거두리라.";
			break;
		case "혼란":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "바보";
			book_cost = "어둠 1";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자신의 소환 스텝에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 그 라운드에 공격할 때 공격 주사위를 플롯할 수 없고, 플롯을 공개할 때 공격 주사위를 굴려야만 한다.";
			book_spell = "바벨! 바 바벨! 바바 바벨!";
			break;
		case "주독":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "부패";
			book_cost = "어둠 1";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 「병마」 상태이상을 걸 수 있다.";
			book_spell = "마녀의 정체 모를 냄비가 부글부글. 연기를 들이마시고 개가 꼴까닥.";
			break;
		case "원념":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "불행";
			book_cost = "어둠 2";
			book_target = "자신의 원형 1개체";
			book_effect = "누적 불가. 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전 동안 목표가 파괴되었을 때 임의의 원형 1개체를 파괴ㅏ거나 임의의 캐릭터 1명에게 2점의 대미지를 입힐 수 있다.";
			book_spell = "인과의 파도, (원형의 특기명)에서 시작하여 응보를 내리라.";
			break;
		case "정체":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "나태";
			book_cost = "어둠 2";
			book_target = "적의 대표 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다(단, 공격 스텝에 사용할 때는 자신이 공격을 하기 전에만 사용할 수 있다). 지정특기 판정에 성공하면 그 라운드의 「공격 스텝」이 발생하지 않고, 「후공 소환 스텝」이 끝나면 「라운드 종료」 처리를 한다.";
			book_spell = "어린 암사슴이여, 너는 함정에 걸리리라. 안녕과 태만이라는 이름의 함정에.";
			break;
		case "입멸":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "죽음";
			book_cost = "어둠 3";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 3점의 대미지를 입힌다";
			book_spell = "재는 재로, 먼지는 먼지로.";
			break;
		case "주문파훼":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "방황";
			book_cost = "어둠 3";
			book_target = "주문을 사용한 캐릭터 1명";
			book_effect = "입회인\n자신에 대해 누군가가 주문을 사용했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표가 사용한 주문을 무효로 하고, 목표에게 1점의 대미지를 입힌다. ";
			book_spell = "왜곡하는 자, 현혹하는 자, 섭리를 어지럽히는 자여. 그대에게 진실을 말할 자격은 없노라.";
			break;
		case "각성":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "자신이 【진정한 모습】을 사용한 장면 동안, 자신이 행동판정에서 다른 특기를 대신 사용할 때, 특기 리스트의 「별」과 「어둠」 분야가 이어져 있는 것으로 간주한다.";
			book_spell = "내일도 오늘처럼 살아가야 한다고 하니, 그 무게야말로 진리로다.";
			break;
		case "영약":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "자신을 목표로 조율을 할 때, 추가로 임의의 캐릭터 2명을 목표로 선택할 수 있다.";
			book_spell = "쌍둥이가 사랑한 소녀의 눈물에 천상의 장미를 적셔두고, 마지막으로 금성의 음악을 한 자밤.";
			break;
		case "환뇌":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "세션을 개시할 때 【일시적 마력】을 2점 획득한다.";
			book_spell = "챠라투스트라는 이렇게 말했도다.";
			break;
		case "유계의창":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "없음";
			book_effect = "1회 제한: 마법전\n 자신이 입회인일 때, 자신이 습득한 소환 타입 마법을 사용해서 대표를 위해 원형을 소환할 수 있다. 그 라운드에 대표가 이미 소환을 사용했다면 이 마법을 사용해서 원형을 소환할 수 없다.";
			book_spell = "우주의 창을 열어라. 변덕스러운 신들의 목소리가 들리는가?";
			break;
		case "뿔피리":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "마법전을 시작하고 세 번째 라운드를 개시할 때, 그 마법전 동안 자신에게 【부스트1】을 부여한다.";
			book_spell = "그 뿔피리가 울릴 때, 그대의 별이 하늘 높이 빛나리라.";
			break;
		case "만화경":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "예지몽 장면에서 악행을 저지르려는 NPC나 그 희생자가 될 캐릭터를 앵커로 두고 있지 않아도 예지몽 판정을 할 수 있다.";
			book_spell = "돌이 꾸는 꿈과 사람이 보는 세계. 둘 다 진실(세계)이요, 둘 다 허구로다.";
			break;
		case "황금률":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 1";
			book_target = "없음";
			book_effect = "판정에서 나온 주사위 눈의 합계가 7이었을 때, 그 장면에 자기 영역의 마소가 1점 발생한다.";
			book_spell = "거울아, 거울아, 거울아, 거울아. 세상에서 가장 아름다운 것은 나. ";
			break;
		case "칠검":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 1";
			book_target = "자신";
			book_effect = "자신이 입회인일 때, 대표가 동의한다면 자신의 【마력】을 1점 소비해서 대표가 해야 할 저항판정을 자신이 대신할 수 있다. 저항판정에 실패하면 주문의 효과는 대표가 받는다.";
			book_spell = "일곱 개의 원죄로 일곱 자루 단검의 날을 세워라.";
			break;
		case "어둠의가방":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 1";
			book_target = "자신";
			book_effect = "이 마법 안에 아이템을 3개까지 수납할 수 있다. 여기에 수납한 아이템은 관계칸에 적어 넣은 아이템과 똑같이 사용할 수 있다.";
			book_spell = "밤의 빛깔로 채색한 가방 속은 어딘가로 이어지니, 그곳은 바로 고독한 우주로다.";
			break;
		case "노래하는가면":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 2";
			book_target = "자신";
			book_effect = "자신이 사용한 주문에 대한 저항판정이 성공했을 때, 그 라운드에 사용할 수 있는 주문의 횟수를 1회 늘린다(동명 마법 사용에 대한 제한은 받는다. 또, 이 마법의 효과로 인해 사용할 수 있는 주문의 횟수가 2회 이상 늘어나지는 않는다).";
			book_spell = "입맞춤은 폭풍, 말은 무지개. 그대의 아름다운 입술에서 흘러 나오는 그것이야말로 마법이로다.";
			break;
		case "탈것":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 3";
			book_target = "없음";
			book_effect = "선택: 습득할 때 / 「혼의 특기」 이외의 특기 1종류 「(선택한 특기명)의 전차」 1개체를 탈것으로 획득해서 사역할 수 있다. 자신이 장면에 등장할 때, 파괴되거나 소멸하지 않았다면 탈것도 같은 타이밍에 소환된다. <우자>는 탈것을 인지할 수 없다.";
			book_spell = "나는 푸른 하늘에 군림하는 용맹한 전차의 기수로다.";
			break;
		case "괴완":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 2";
			book_target = "자신";
			book_effect = "주문 판정에서 주사위를 굴릴 때, 추가로 주사위를 1개 더 굴린다. 이때 굴린 주사위 중에서 판정에 사용할 주사위 눈을 2개 선택한다. 선택하지 않은 주사위는 판정에 사용하지 않는다.";
			book_spell = "세계를 배우고 지키려면 팔 두개로는 너무나도 부족하니, 고양이 손이라도, 벌레의 앞다리라도 빌리고 싶구나.";
			break;
		case "연쇄":
			book_use = true;
			book_cate = "서경";
			book_type = "주문";
			book_spec = "흐름";
			book_cost = "힘 1";
			book_target = "자신";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드에서 자신의 공격 스텝에 공격을 성공했을 때, 공격 주사위에 남아 있는 ⚂과 ⚃의 조합 한 쌍마다 목표에게 【추가 대미지】를 부여한다.";
			book_spell = "용이 가로되 「물이 되시게, 벗이여」";
			break;
		case "번개사슬":
			book_use = true;
			book_cate = "서경";
			book_type = "주문";
			book_spec = "우레";
			book_cost = "힘 1";
			book_target = "없음";
			book_effect = "마법전에서 자신의 소환 스텝에 사용할 수 있다. 지정특기 판정에 성공하면 임의의 주사위 눈을 1개 플롯할 수 있다. 이 플롯은 상대가 공격 주사위를 공개했을 때 공개한다. 상대의 공격 주사위 중에 플롯한 것과 같은 눈의 주사위가 있다면, 상대는 2점의 대미지를 입는다.";
			book_spell = "솟구쳐라, 주권! 전기석(토르말린)의 인과!";
			break;
		case "주문받아치기":
			book_use = true;
			book_cate = "서경";
			book_type = "주문";
			book_spec = "환각";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "입회인\n자신을 목표로 하는 주문에 대한 저항판정에 성공했을 때 사용할 수 있다. 지정특기 판정에 성공하면 자신이 그 주문의 사용자가 되며, 그 주문의 목표를 자신 대신 주문의 사용자로 변경한다.";
			book_spell = "(자신의 마법명)의 이름으로. 나를 따르라, 힘의 섭리여!";
			break;
		case "영안":
			book_use = true;
			book_cate = "서경";
			book_type = "주문";
			book_spec = "수수께끼";
			book_cost = "꿈 1";
			book_target = "캐릭터 1명";
			book_effect = "드라마 장면에 사용할 수 있다. 지정특기 판정에 성공하면 GM은 목표의 능력치, 영역, 특기, 장서의 데이터를 가르쳐준다. 목표가 <우자>일 경우, <단장>에 빙의당했다면 <단장>의 능력치, 영역, 특기, 장서의 데이터를 가르쳐준다. 빙의당하지 않았다면 <우자>임을 선언한다. 또, 목표가 가진 핸드아웃의 【비밀】이 백지 비밀이었다면 그것도 가르쳐준다.";
			book_spell = "나는 올빼미, 어둠 속에서 날개짓하며 진실을 사냥하노라.";
			break;
		case "거짓감지":
			book_use = true;
			book_cate = "서경";
			book_type = "주문";
			book_spec = "거짓";
			book_cost = "꿈 2";
			book_target = "NPC 1명";
			book_effect = "NPC가 발언했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표의 발언이 거짓인지, 진실인지, 혹은 어느 쪽도 아닌지를 GM에게 들을 수 있다.";
			book_spell = "명왕의 거울이여, 진실을 비춰라.";
			break;
		case "혜성":
			book_use = true;
			book_cate = "서경";
			book_type = "주문";
			book_spec = "천공";
			book_cost = "별 3";
			book_target = "단일";
			book_effect = "마법전에서 자신의 소환 스텝에 사용할 수 있다. 지정특기 판정을 한다. 성공하면 이 마법을 사용한 라운드를 0라운드로 간주해서 3라운드가 지난 후, 자신의 소환 스텝이 종료될 때(집단전이라면 3라운드 후에 해당하는 아군의 소환 스텝을 종료할 때) 목표에게 6점의 대미지를 입힌다. 목표가 저항판정을 할 경우, 대미지를 입을 때 한다.";
			book_spell = "천공의 세 현자의 이름을 걸고 경고하노니, 투항하라.";
			break;
		case "위장":
			book_use = true;
			book_cate = "서경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "2회 제한: 세션 자신이 판정을 했을 때, 그 결과가 펌블이 아니며 판정 내용이 자신의 「사회적 신분」과 관련된 것이었다면 그 판정을 다시 굴릴 수 있다(「사회적 신분」과 관계가 있는지는 GM이 판단한다). 이 마법은 「사회적 신분」이 설정되어 있지 않거나 「마법사」일 경우에는 사용할 수 없다.";
			book_spell = "수상한 자가 아닙니다. 저는 보잘것없는 (사회적 신분)이에요.";
			break;
		case "압창":
			book_use = true;
			book_cate = "서경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "주문 타입 마법을 사용할 때, 판정에 +1의 수정을 적용한다.";
			book_spell = "노래하라, 12성좌! 나에게 승리를!";
			break;
		case "심판의불":
			book_use = true;
			book_cate = "서경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신의 공격 스텝에 공격이 성공했을 때, 자기 영역의 숫자에 대응하는 눈의 공격 주사위가 2개 이상 남아 있다면 그 마법전 동안 목표에게 【추가 대미지1】을 부여한다.";
			book_spell = "내 (영역명)의 생명의 나무(세피로트), 그 가지를 꺾고 잎을 따서 화톳불을 켜리라.";
			break;
		case "서형":
			book_use = true;
			book_cate = "서경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "이 캐릭터가 사용하는 주문에 대해 저항판정을 할 경우, 그 판정에 -2의 수정을 적용한다.";
			book_spell = "마법 범죄를 확인. 이제부터 서경(북 워치)을 개시한다!";
			break;
		case "쌍검":
			book_use = true;
			book_cate = "서경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "자신이 「마검」 원형을 소환할 때, 자기 영역에서 무작위로 특기를 하나 선택한다. 그 마법전에서 「(선택한 특기명)의 마검」이 아직 소환되지 않았다면 그것을 1개체 소환한다.";
			book_spell = "쌍둥이 마검이여, 가라!";
			break;
		case "공격수칙":
			book_use = true;
			book_cate = "서경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "자신의 【공격력】이 1점 상승한다.";
			book_spell = "(문양을 들어올리며) 가속하라, 각인.";
			break;
		case "대출":
			book_use = true;
			book_cate = "사서";
			book_type = "주문";
			book_spec = "비";
			book_cost = "전 1";
			book_target = "아군 대표 1명";
			book_effect = "입회인\n마법전에서 자신이 입회인일 때, 임의의 타이밍에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 자신의 마소를 2점까지 건네줄 수 있다.";
			book_spell = "말의 비가 낳은 칠색의 다리. 그에게 닿아라.";
			break;
		case "재단":
			book_use = true;
			book_cate = "사서";
			book_type = "주문";
			book_spec = "승리";
			book_cost = "노래 1";
			book_target = "단장 또는 금서 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 2점의 대미지를 입힌다.";
			book_spell = "나는 전율한다. 책을 해체하는 대죄에!";
			break;
		case "검색":
			book_use = true;
			book_cate = "사서";
			book_type = "주문";
			book_spec = "수수께끼";
			book_cost = "꿈 1";
			book_target = "본문 참조";
			book_effect = "입회인\n자신이 대미지를 입었을 때 사용할 수 있다. 지정특기 판정에 성공하면 대미지를 입힌 상대 중에서 1개체를 목표로 선택한다. 목표에게 【비밀】이 설정되어 있다면 그것을 공개한다.";
			book_spell = "나는 고양이로소이다. 호기심에 몸을 맡겨 책장의 어둠에 발을 들일 것이오.";
			break;
		case "책의바다":
			book_use = true;
			book_cate = "사서";
			book_type = "주문";
			book_spec = "바다";
			book_cost = "별 2";
			book_target = "자신";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 자기 장서의 주문 타입 마법을 하나 선택한다. 그 마법을 그 세션 동안 자신이 습득 가능한 다른 주문 타입 마법 하나로 변경할 수 있다.";
			book_spell = "바다여, 지혜의 바다여. 옮겨다오, 유리의 편지를.";
			break;
		case "검열":
			book_use = true;
			book_cate = "사서";
			book_type = "주문";
			book_spec = "빛";
			book_cost = "힘 2";
			book_target = "캐릭터 1명";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 목표의 장비 타입 마법을 하나 선택한다. 지정특기 판정에 성공하면 해당 마법을 그 마법전 동안 무효로 한다.";
			book_spell = "어떠한 책도 나의 허가 없이는 찾을 수 없으리.";
			break;
		case "시간되감기":
			book_use = true;
			book_cate = "사서";
			book_type = "주문";
			book_spec = "시간";
			book_cost = "노래 3";
			book_target = "캐릭터 1명";
			book_effect = "입회인\n자신이 입회인인 마법전에서 아군이 판정에 실패했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표가 그 판정을 다시 굴리게 할 수 있다.";
			book_spell = "시간이여! 석양에 울리는 폐관의 종소리에 잠깐 동안의 유예를!";
			break;
		case "분석":
			book_use = true;
			book_cate = "사서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "마법전에서 누군가의 입회인이 되었을 때, 방어 주사위를 1개 더 플롯할 수 있다.";
			book_spell = "몰아 넣어라, 전지전능! 인과의 모순을 폭로하라!";
			break;
		case "독서":
			book_use = true;
			book_cate = "사서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "조사판정이 자동으로 성공한다.";
			book_spell = "나, 독파하노라. 진실은 행간에 있도다.";
			break;
		case "영장":
			book_use = true;
			book_cate = "사서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "자신의 【방어력】이 1점 상승한다.";
			book_spell = "순환하라, 지식이여. 논리를 구동하여 방벽이 되어라!";
			break;
		case "수호력":
			book_use = true;
			book_cate = "사서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 2";
			book_target = "자신";
			book_effect = "마법전에서 자신이 입회인이 되었다면, 대표가 입을 대미지를 최대 자신의 【마력】 현재치만큼까지 대신 입을 수 있다. 이 효과를 사용해서 공격의 대미지를 모두 자신이 받아냈다면 이 마법에 충전한 마소를 1점 감소하며, 피드백은 발생하지 않게 된다.";
			book_spell = "나는 글을 관리하는 자. 책의 성이어야 마땅할지니.";
			break;
		case "핵심단어":
			book_use = true;
			book_cate = "사서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "노래 1";
			book_target = "자신";
			book_effect = "자신이 주문으로 입는 대미지가 1점 경감된다.";
			book_spell = "적성 마법의 핵심 단어, 해석 개시. 대항 마법을 자동 전개.";
			break;
		case "어둠의표장":
			book_use = true;
			book_cate = "사서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 2";
			book_target = "자신";
			book_effect = "1회 제한: 세션\n선택: 장면을 개시할 때 / 자신의 경력과 다른 경력 마법 1종류 그 장면 동안 선택한 마법을 습득한다.";
			book_spell = "인과의 열쇠(코즐 키), 인증 개시.";
			break;
		case "그림자인장":
			book_use = true;
			book_cate = "서공";
			book_type = "소환";
			book_spec = "";
			book_cost = "꿈 X";
			book_target = "자신의 원형 1개체";
			book_effect = "목표의 레벨만큼 코스트를 소비하고, 자기 영역에서 무작위로 특기를 하나 선택한다. 지정특기 판정에 성공하면, 그 마법전에서 「(그 특기명)의 (목표와 같은 카테고리의 원형)」이 아직 소환되지 않았을 경우 그것을 1개체 소환한다.";
			book_spell = "구텐베르크의 눈동자. 그 빛으로 투영된 모습을 드러내리.";
			break;
		case "교정":
			book_use = true;
			book_cate = "서공";
			book_type = "주문";
			book_spec = "";
			book_cost = "전 1";
			book_target = "원형 1개체";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 자신의 특기 리스트를 보고, 목표의 상징에 해당하는 특기로부터 2칸 이내에 있는 특기를 하나 선택한다. 목표의 상징과 특기를 선택한 특기로 변경한다.";
			book_spell = "너는 누가 꾸는 꿈이냐? 인간이냐, 짐승이냐, 아니면 이 별이냐?";
			break;
		case "교역":
			book_use = true;
			book_cate = "서공";
			book_type = "주문";
			book_spec = "황금";
			book_cost = "별 1";
			book_target = "원형을 사역하는 캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 사역하는 원형 1개체와 자신이 사역하는 원형 1개체를 교환한다(자신이 원형을 사역하고 있지 않다면 효과가 없다).";
			book_spell = "오이코노미쿠스의 수레바퀴, 저승 끝자락에서 그 톱니가 삐걱이나니.";
			break;
		case "강화":
			book_use = true;
			book_cate = "서공";
			book_type = "주문";
			book_spec = "심연";
			book_cost = "어둠 1";
			book_target = "원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드 동안 목표의 【부스트】를 1점 상승시킨다(【부스트】를 가지지 않은 원형에게는 효과가 없다).";
			book_spell = "형해를 넘어가라. 나, 패러독스를 지양하노니.";
			break;
		case "사본":
			book_use = true;
			book_cate = "서공";
			book_type = "주문";
			book_spec = "이야기";
			book_cost = "노래 2";
			book_target = "단일";
			book_effect = "입회인\n자신 이외의 누군가가 주문 타입 또는 소환 타입의 마법을 사용했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표가 사용한 마법을 일시적으로 습득할 수 있다. 세션 동안 그 마법을 코스트 없이 한 번만 사용할 수 있다(코스트가 X인 것은 1로 간주한다).";
			book_spell = "나선을 그려라, 뉴클레오티드의 신비로.";
			break;
		case "중압":
			book_use = true;
			book_cate = "서공";
			book_type = "주문";
			book_spec = "중력";
			book_cost = "힘 3";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입히며, 거기에 더해 그 라운드 동안 목표의 【공격력】과 【방어력】을 1점씩 감소한다.";
			book_spell = "뉴턴은 미소 지으며, 중력의 수수께기를 가두었도다.";
			break;
		case "수복":
			book_use = true;
			book_cate = "서공";
			book_type = "주문";
			book_spec = "원환";
			book_cost = "힘 X";
			book_target = "원하는 만큼의 캐릭터";
			book_effect = "자기 차례에 사용할 수 있다. 목표의 수만큼 코스트를 소비하고, 지정특기 판정을 한다. 성공하면 목표에게 걸린 상태 이상을 하나 회복할 수 있다(목표마다 다른 종류의 상태이상을 회복할 수 있다).";
			book_spell = "다시 돌아가라, 영원한 프랙탈의 이름으로.";
			break;
		case "원호":
			book_use = true;
			book_cate = "서공";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "마법전에서 누군가의 입회인이 되었을 때, 방어 시에 방어 주사위를 플롯하는 대신 공격 시에 공격 주사위를 플롯할 수 있다.";
			book_spell = "원칙은 예외로 이루어지니, 방패여! 창이 되어라!";
			break;
		case "장정":
			book_use = true;
			book_cate = "서공";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "【마력】의 최대치를 결정하거나 「마력 리셋」을 할 때, 그 최대치를 2점 상승시킬 수 있다.";
			book_spell = "고양이는 웃는다. 슈뢰딩거의 비밀, 여기에 있도다.";
			break;
		case "합본":
			book_use = true;
			book_cate = "서공";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득할 때 / 주문 타입 마법 2종류 선택한 마법을 추가로 습득한다. ";
			book_spell = "지혜여, 모여라. 두 권은 한 권보다 강한 법.";
			break;
		case "마법붓":
			book_use = true;
			book_cate = "서공";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 조율에 성공해서 「마소 발생」을 선택했을 때, 주사위를 2개 더 굴린다. 굴린 결과에 대응하는 마소가 발생한다.";
			book_spell = "춤추는 붓, 그 이름을 불러라. (붓에 붙인 이름). 부르면 바로 나타나리.";
			break;
		case "번역":
			book_use = true;
			book_cate = "서공";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 1";
			book_target = "자신";
			book_effect = "자신이 행동판정에서 다른 특기를 대신 사용할 때, 특기 리스트의 「별」과 「어둠」분야가 이어져 있는 것으로 간주한다.";
			book_spell = "나는 구도자로소이다. 어둠에서 빛을 찾으리니.";
			break;
		case "조우":
			book_use = true;
			book_cate = "방문자";
			book_type = "주문";
			book_spec = "미소";
			book_cost = "노래 1";
			book_target = "자신";
			book_effect = "드라마 장면에 사용할 수 있다. 지정특기 판정에 성공하면 그 장면에 등장한 NPC 1명을 목표로 사건 행동을 실행한다.";
			book_spell = "스승께서 가라사대 「만남이야말로 생명, 이별이야 말로 마법」";
			break;
		case "정오표":
			book_use = true;
			book_cate = "방문자";
			book_type = "주문";
			book_spec = "기도";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전 동안 목표가 【부스트2】를 습득한다. 이 이펙트는 공격할 때 자신의 공격 주사위보다 상대의 방어 주사위가 많은 경우, 또는 방어할 때 자신의 방어 주사위보다 상대의 공격 주사위가 많은 경우에만 사용할 수 있다.";
			book_spell = "스승께서 가라사대 「너를 올바르게 서술할 수 있는 것은 오로지 너뿐이리라.」";
			break;
		case "이변":
			book_use = true;
			book_cate = "방문자";
			book_type = "주문";
			book_spec = "우연";
			book_cost = "꿈 1";
			book_target = "캐릭터 1명";
			book_effect = "누군가가 표에서 주사위를 굴렸을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 표에서 굴린 주사위를 다시 굴리게 할 수 있다.";
			book_spell = "스승께서 가라사대 「너는 모순. 깜짝 상자. 모든 것이 악몽.」";
			break;
		case "정화":
			book_use = true;
			book_cate = "방문자";
			book_type = "주문";
			book_spec = "태양";
			book_cost = "별 2";
			book_target = "없음";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전에 참가한 모든 원형을 파괴할 수 있다.";
			book_spell = "스승께서 가라사대 「손바닥을 비추며 외쳐라. 〔빛이 있으리〕라고.」";
			break;
		case "무심":
			book_use = true;
			book_cate = "방문자";
			book_type = "주문";
			book_spec = "우연";
			book_cost = "꿈 3";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자신의 공격 스텝에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 그 라운드에 공격할 때 공격 주사위를 무작위로 플롯해야만 한다. 또, 목표에게 【추가 대미지 2】를 부여한다.";
			book_spell = "스승께서 가라사대 「마음을 비워 길을 열도다.」";
			break;
		case "충동":
			book_use = true;
			book_cate = "방문자";
			book_type = "주문";
			book_spec = "분노";
			book_cost = "짐승 X";
			book_target = "원하는 만큼의 원형";
			book_effect = "마법전에서 자기 차례일 때 사용할 수 있다. 목표의 수만큼 코스트를 소비하고, 지정특기 판정을 한다. 성공하면 그 라운드 동안 목표의 【추가 대미지】를 1점 상승시킨다. (【추가 대미지】를 가지지 않은 원형에게는 효과가 없다)";
			book_spell = "스승께서 가라사대 「이것은 들에서 짐승이 고기를 찢어발기는 것과 다름없음이니, 아직껏 너의 분노에 깃들어 있구나.」";
			break;
		case "소망":
			book_use = true;
			book_cate = "방문자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "「사건 표」에서 주사위를 굴릴 때, 굴린 주사위 눈에 ±1을 적용할 수 있다.";
			book_spell = "스승께서 가라사대 「세계의 한숨. 단 한 걸음이 낳은 희곡.」";
			break;
		case "벗":
			book_use = true;
			book_cate = "방문자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득했을 때 【운명】 2의 <우자> 앵커 1명을 관계 칸에 적어 넣는다. 그 앵커는 【벗】을 습득하고 있는 한 유지할 수 있다. 이 마법을 미습득 상태로 되돌리면, 관계 칸에서 그 캐릭터를 소거한다(상흔이 되었다면 소거할 수 없다).";
			book_spell = "스승께서 가라사대 「기적적인 만남이라는 자각도 없이 너희는 서로에게 다가섰노라.」";
			break;
		case "가면":
			book_use = true;
			book_cate = "방문자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "세션을 개시할 때 백지 【비밀】을 획득한다. 이 【비밀】이 공개되었을 때, 「백지 비밀 표」에서 「역장 표」나 「동맹 표」 중 원하는 쪽을 사용해서 무작위로 내용을 결정한다. 결정한 내용은 그 세션동안에만 유효하다.";
			book_spell = "스승께서 가라사대 「흔들거리는 인과. 너는 마치 신기루와도 같으니.」";
			break;
		case "행운":
			book_use = true;
			book_cate = "방문자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "노래 1";
			book_target = "캐릭터 1명";
			book_effect = "3회 제한: 세션 누군가가 판정에서 주사위를 굴렸을 때, 그 주사위를 다시 굴릴 수 있다.";
			book_spell = "스승께서 가라사대 「너는 운명을 찾아가는 자로다.」";
			break;
		case "흉운":
			book_use = true;
			book_cate = "방문자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 1";
			book_target = "자신";
			book_effect = "자신이 판정에 실패하면, 그 판정에 사용한 주사위의 눈에 대응하는 마소를 획득한다.";
			book_spell = "스승께서 가라사대 「넘어지고, 또 넘어져라. 그 앞에 구원이 있을 것이니.」";
			break;
		case "소거":
			book_use = true;
			book_cate = "방문자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 2";
			book_target = "자신";
			book_effect = "자신을 목표로 하는 주문이 사용되었을 때, 그 판정에 -2의 수정을 적용한다.";
			book_spell = "스승께서 가라사대 「너를 미덩라. 너 말고는 모두 그림자. 너 말고는 모두 환상.」";
			break;
		case "변환":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "길";
			book_cost = "별 1";
			book_target = "없음";
			book_effect = "자기 차례에 사용할 수 있다. 자신의 【마력】을 원하는 만큼 소비한다. 지정특기 판정에 성공하면 소비한 【마력】만큼 임의의 마소가 발생한다.";
			book_spell = "나는 불가사의 그 자체. 이 몸을 해명해 신비를 읊조리노라.";
			break;
		case "괴력":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "살";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "마법전 동안 자기 차례에 사용할 수 있다. 자신의 【마력】을 1~2점 소비한다. 소비한 【마력】만큼의 【추가 대미지】를 그 라운드 동안 목표에게 부여한다.";
			book_spell = "용솟음쳐라, 마의 혈통. 나는 괴력무쌍.";
			break;
		case "공물":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "피";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "자신의 앵커의 【운명】이 상승했을 때 사용할 수 있다. 지정특기 판정에 성공하면 자신의 【마력】을 1D6점 회복할 수 있다.";
			book_spell = "지금이야말로 감미로운 운명의 미주(와인)를 마셔보자. 건배(알라보트호)!";
			break;
		case "흡정":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "피";
			book_cost = "짐승 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입히고, 자신의 【마력】을 1점 회복한다.";
			book_spell = "너를 이루는 피와 살과 정수, 실로 맛이 좋도다, 맛이 좋도다.";
			break;
		case "짐승변신":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "외침";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "마법전 동안 자신이 공격을 하기 직전에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드 동안 자신의 【공격력】이 1점 상승한다. 단, 공격의 플롯을 무작위로 해야 한다.";
			book_spell = "이성의 가죽을 벗어던지고, 야생으로 돌아가리.(짐승이 울부짖는 소리)";
			break;
		case "재생":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "살";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전 동안 라운드를 종료할 때 【마력】이 1점 회복하게 된다.";
			book_spell = "우자들이 동경해 마지 않는 불로불사. 우리는 이미 불로불사.";
			break;
		case "감염":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "악의";
			book_cost = "어둠 2";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 「타짐」 상태이상을 걸 수 있다.";
			book_spell = "어디의 누군지도 모를 몸. 저주 하나 정도는 최소한의 소양.";
			break;
		case "타락":
			book_use = true;
			book_cate = "이단자";
			book_type = "주문";
			book_spec = "나태";
			book_cost = "어둠 3";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 라운드 동안 목표의 【공격력】을 3점 감소할 수 있다(1 미만이 되지는 않는다).";
			book_spell = "저주가 있으리! 아둔한 당나귀에게 구더기가 끓으리라!";
			break;
		case "마술언어":
			book_use = true;
			book_cate = "이단자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "소환 타입 마법을 사용할 때, 판정에 +1의 수정을 적용한다.";
			book_spell = "나의 말은 바람을 타고 눈처럼 내려 쌓이나니, 잘 익은 술처럼 향을 풍길지어다.";
			break;
		case "갈고리발톱":
			book_use = true;
			book_cate = "이단자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신의 공격 스텝에 공격이 성공했을 때, 자기 영역의 숫자에 대응하는 눈의 공격 주사위가 1개 이상 남아 있다면 공격한 상대에게 「타짐」 상태이상을 걸 수 있다.";
			book_spell = "박수갈채, 괴물원(프릭스)! 대가는 그대의 피와 살로!";
			break;
		case "조상신":
			book_use = true;
			book_cate = "이단자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "소환 스텝에 소환을 2회까지 할 수 있다. 단, 소환을 2회 할 때는 두 번의 판정 모두에 -2의 수정을 적용한다. 이때, 【긴급 소환】은 선택한 정령의 종류마다 별개의 마법으로 간주한다(라운드마다 2회 사용할 수 있다).";
			book_spell = "새를 모방하니 수은의 음색이 들리는도다.";
			break;
		case "마족":
			book_use = true;
			book_cate = "이단자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 1";
			book_target = "자신";
			book_effect = "자신의 【근원력】이 1점 상승한다.";
			book_spell = "나는 (영역명)의 공자로다.";
			break;
		case "나락문":
			book_use = true;
			book_cate = "외전";
			book_type = "소환";
			book_spec = "심연";
			book_cost = "어둠 2";
			book_target = "단일";
			book_effect = "누적 불가\n지정특기 판정에 성공하면 그 마법전 동안 라운드를 종료할 때 목표를 1개체 선택한다. 목표에게 1점의 대미지를 입힌다.";
			book_spell = "진정한 무(無)여. 허무의 왕이여. 어둠보다 짙은 심연에서 나타나 모든 것을 집어삼켜라.";
			break;
		case "광란":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "광기";
			book_cost = "꿈 1";
			book_target = "캐릭터 1명";
			book_effect = "누적 불가\n마법전에서 자기 차례일 때 사용할 수 있다. 지정특기 판정에 성공하면 이 라운드 동안 목표의 【방어력】을 1점 감소하고, 【공격력】을 1점 상승시킨다.";
			book_spell = "참으로 보기 싫도다, 비단 장갑. 이번에야말로 찢어버리리.";
			break;
		case "교사":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "왜곡";
			book_cost = "어둠 1";
			book_target = "자신의 앵커 1명";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 목표의 「소원」을 임의의 내용으로 변경할 수 있다. 운명의 힘을 사용해서 목표의 힘을 빌릴 때, 목표는 이 마법으로 정해진 「소원」을 선언한다. 이 효과는 그 「소원」이 이루어지거나, 그 세션을 종료하면 무효가 된다.";
			book_spell = "나는 거울. 애욕과 절망으 저편에 이르기까지 모르는 것이 없도다.";
			break;
		case "기생충":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "벌레";
			book_cost = "짐승 2";
			book_target = "자신에게 대미지를 입힌 캐릭터 1명";
			book_effect = "입회인\n자신이 대미지를 입었을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 자신이 입은 대미지+1점의 대미지를 입힌다.";
			book_spell = "몸을 쉬게 할 자신의 집을 지켜야 할 때가 왔도다. 이 몸에서 나와 좀먹고, 침식하라.";
			break;
		case "매료":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "사랑";
			book_cost = "노래 2";
			book_target = "자신 이외의 캐릭터 1명";
			book_effect = "누적 불가\n자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 세션 동안 목표가 하는 모든 판정에 +1이나 -1의 수정을 적용할 수 있다.";
			book_spell = "숨막히는 향기(퍼퓸). 달콤한 패배.";
			break;
		case "주력폭탄":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "어둠 2";
			book_target = "주문을 사용한 캐릭터 1명";
			book_effect = "입회인\n자신이 주문에 대한 저항판정에 성공했을 때 사용할 수 있다. 목표에게 2점의 대미지를 입힌다.";
			book_spell = "인과응보. 남을 저주할 때는 구멍 두 개. 책을 저주하면 폭발사산!";
			break;
		case "재액":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "외침";
			book_cost = "짐승 3";
			book_target = "자신과 단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1D6점의 대미지를 입힐 수 있다. 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 목표만이 대미지를 무효로 할 수 있다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "꽃을 피워라, 단말마여. 너는 아름답다.";
			break;
		case "지배":
			book_use = true;
			book_cate = "외전";
			book_type = "주문";
			book_spec = "배신";
			book_cost = "어둠 X";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 목표가 사용하는 원형 1개체를 선택한다. 그 원형의 레벨+1만큼 코스트를 소비하고, 지정특기 판정을 한다. 판정에 성공하면 그 라운드 동안 목표 대신 해당 원형을 사용할 수 있다.";
			book_spell = "배덕에 손을 물들여라. 통곡의 벽은 너무나도 차갑도다.";
			break;
		case "부록":
			book_use = true;
			book_cate = "외전";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택 : 습득할 때 / 소환 타입 마법 2종 선택한 마법을 추가로 습득한다.";
			book_spell = "꿈틀거리는 것이 내장에 깃들었다. 나, 깨달았도다. 생명의 기쁨을.";
			break;
		case "특약":
			book_use = true;
			book_cate = "외전";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신의 【마력】과 【일시적 마력】의 합계치가 자기 【마력】 최대치의 절반(나머지 올림) 이하인 상태라면, 목표에게 【추가 대미지2】를 부여한다.";
			book_spell = "나의 피로 자유를 얻으리라. 이루어질지어다!";
			break;
		case "저항":
			book_use = true;
			book_cate = "외전";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "주문에 대한 저항판정에 +1의 수정을 적용한다.";
			book_spell = "헛수고를 향해 무의미하다며 못을 박으라. 어차피 현실은 모라토리엄.";
			break;
		case "속독":
			book_use = true;
			book_cate = "외전";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "힘 1";
			book_target = "자신";
			book_effect = "마법전을 할 때, 한 라운드에 주문 타입 마법을 2회 사용할 수 있다(단, 같은 이름의 마법은 원래의 규칙대로 라운드마다 한 번씩만 사용할 수 있다).";
			book_spell = "나는 한숨을 쉬노라. 세계는 더럽혀졌고, 불가사의가 흩날리나니.";
			break;
		case "빛의날개":
			book_use = true;
			book_cate = "원탁";
			book_type = "주문";
			book_spec = "날개";
			book_cost = "짐승 1";
			book_target = "본문 참조";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 장면에 등장한 모든 「어둠」 영역의 캐릭터를 목표로 선택한다. 목표 전원에게 1점의 대미지를 입힌다. 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 목표만이 대미지를 무효로 할 수 있다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다. ";
			book_spell = "꿇어 엎드려, 울면서 우러러보리라. 우리의 날개에서 벗어날 길은 없을지니라.";
			break;
		case "철퇴":
			book_use = true;
			book_cate = "원탁";
			book_type = "주문";
			book_spec = "충격";
			book_cost = "힘 2";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 2점의 대미지를 입힌다. 또, 목표가 【일시적 마력】을 1점 이상 가지고 있다면 1점의 대미지를 더 입힌다.";
			book_spell = "이것은 교훈, 우리의 분노.";
			break;
		case "거절":
			book_use = true;
			book_cate = "원탁";
			book_type = "주문";
			book_spec = "빛";
			book_cost = "힘 2";
			book_target = "없음";
			book_effect = "누적 불가\n자기 차례에 사용할 수 있다. 그 장면 동안 모든 주문 판정에 -2의 수정을 적용한다. 이 주문은 코스트를 소비하지 않아도 사용할 수 있다. 코스트를 소비하지 않고 이 주문을 사용했을 때는 본래 소비해야했던 마소를 메모해둔다. 그리고 그 사이클 마지막에 본래 소비해야 했던 코스트를 소비한다. 소비할 수 없었다면 부족한 마소 1점마다 자신의 【마력】을 1D6점 감소한다.";
			book_spell = "우리야말로 빛. 징계의 천리(天理).";
			break;
		case "후원":
			book_use = true;
			book_cate = "원탁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "도입 페이즈에서 마소를 아무거나 자기 계제만큼 획득한다. 단, 그중 1점은 반드시 자기 영역의 마소여야 한다.";
			book_spell = "우리는 나누어 가지노라. 위대한 사명을 위하여.";
			break;
		case "권위의지팡이":
			book_use = true;
			book_cate = "원탁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "메인 페이즈의 마법전에서 항상 선공이 된다 (상대가 마법전을 신청했더라도 성공이 된다).";
			book_spell = "석장의 쇳소리, 우리가 행하는 조복의 선율이로다.";
			break;
		case "구제":
			book_use = true;
			book_cate = "원탁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "자신이 운명 개입 판정을 할 때, +2의 수정을 적용한다.";
			book_spell = "운명의 실을 잣는 이에게 엎드려 빈다. 잘못을 바로잡고 평온해지를 바란다고.";
			break;
		case "포박":
			book_use = true;
			book_cate = "학원";
			book_type = "주문";
			book_spec = "";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "입회인\n자신이 입회인이고, 아군 대표를 목표로 하는 주문이 사용되었을 때 저항판정을 하는 대신 사용할 수 있다. 그 주문의 지정특기가 이 주문의 지정특기가 된다. 지정특기 판정에 성공하면 그 주문을 무효로 하고, 무작위로 선택한 마소 1점을 획득하거나 자신의 【마력】을 2점 회복할 수 있다.";
			book_spell = "난폭하게 날뛰는 각인, 내 손으로 돌아오리라.";
			break;
		case "교도":
			book_use = true;
			book_cate = "학원";
			book_type = "주문";
			book_spec = "정열";
			book_cost = "노래 1";
			book_target = "단일";
			book_effect = "누적 불가\n마법전에서 라운드를 종료할 때 사용할 수 있다. 지정특기 판정에 성공하면 자신이 습득한 특기 1종류를 선택한다. 그 마법전을 종료할 때까지 목표에게 그 특기를 습득시킬 수 있다.";
			book_spell = "귀를 기울여라. 바람의 속삭임에, 대지의 땅울림에, 강이 흐르는 소리에, 내면에 깃든 불꽃의 노래에.";
			break;
		case "전승":
			book_use = true;
			book_cate = "학원";
			book_type = "주문";
			book_spec = "이야기";
			book_cost = "노래 2";
			book_target = "원하는 만큼의 캐릭터 (입회인도 가능)";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 그 장면을 종료할 때까지 행동판정을 할 때 +1의 수정을 적용할 수 있다.";
			book_spell = "시는 이야기한다. 전세의 인과를, 용자의 비극을.";
			break;
		case "선도자":
			book_use = true;
			book_cate = "학원";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득할 때 / 「혼의 특기」 이외의 특기 1종류 멘토 역할을 맡아줄 정령으로 「(선택한 특기명)의 정령」을 1개체 획득해서 사역할 수 있다. 자신이 장면에 등장할 때, 멘토 정령은 파괴되거나 소멸하지 않았다면 장면의 종류를 불문하고 같은 타이밍에 소환된다. <우자>는 멘토 정령을 지각할 수 없다.";
			book_spell = "그대는 날개. 나, 둥지를 떠날 때까지 그대의 비호를 바라노라.";
			break;
		case "제복":
			book_use = true;
			book_cate = "학원";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신의 영역과 분야가 같은 특기가 지정특기인 주문에 대해 저항판정을 할 때, 저항판정에 +2의 수정을 적용한다. 또, 【일시적 마력】 1점을 획득한다.";
			book_spell = "(거울 앞에서) 칼라 오케이! 기장 오케이! 넥타이 오케이!";
			break;
		case "교본":
			book_use = true;
			book_cate = "학원";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 세션을 개시할 때 / 자신의 장서 중에서 소환 또는 주문 타입의 마법 1종류 그 세션 동안 선택한 마법의 코스트가 1점 감소한다(단, 1점 미만이 되지는 않으며, 코스트가 X일 때는 코스트가 1점 감소하는 것이 아니라 마치 1점을 더 소비한 것처럼 처리한다).";
			book_spell = "선현이 남긴 발자취. 나는 그 발자국을 조심스럽게 따라가리.";
			break;
		case "성신":
			book_use = true;
			book_cate = "천애";
			book_type = "주문";
			book_spec = "이계";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 자신이 습득한 소환 타입 마법을 하나 선택한다. 그 마법을 사용할 때 필요한 코스트만큼의 마소를 그 소환 마법진에 충전한다(X라면 1). 단, 이 효과로 그 마법에 충전할 수 있는 상한을 초과할 수는 없다.";
			book_spell = "대우주를 떠도는 별들이여. 그 경로를 읽으며 때를 기다리나니.";
			break;
		case "예지":
			book_use = true;
			book_cate = "천애";
			book_type = "주문";
			book_spec = "미래";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 주사위를 6개 굴리고, 원하는 순서로 왼쪽에서부터 오른쪽을 향해 한 줄로 늘어놓는다. 그 후, 행동판정을 할 때마다 2D6을 굴리는 대신 왼쪽부터 순서대로 2개씩 주사위를 집어와서 해당하는 눈이 나온 것으로 간주한다. 이 효과는 6개의 주사위 모두 사용할 때까지(행동판정을 세 번 할 때까지) 지속된다.";
			book_spell = "나의 눈은 보이지 아니하니. 꿈의 향기를 따라 걸어가리.";
			break;
		case "투시":
			book_use = true;
			book_cate = "천애";
			book_type = "주문";
			book_spec = "우연";
			book_cost = "꿈 2";
			book_target = "캐릭터 1명";
			book_effect = "누군가가 플롯을 했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표는 플롯한 주사위를 1개 공개해야만 한다(어느 것을 공개할지는 목표가 선택할 수 있다)..";
			book_spell = "보이지 않는 그림을 그려라. 읽을 수 없는 문자를 기록하라.";
			break;
		case "점술카드":
			book_use = true;
			book_cate = "천애";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "조율 판정이 자동으로 성공한다.";
			book_spell = "기억을 더듬어 되살린 구상, 휴식의 정원으로 인도하리.";
			break;
		case "꿈의베개":
			book_use = true;
			book_cate = "천애";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 조사에 성공했을 때, 「마력 리셋」을 할 수 있다.";
			book_spell = "꿈은 천 가지 환상으로 통하는 길이로다. 방황하는 두 다리를 떠받쳐라.";
			break;
		case "꿈의그물":
			book_use = true;
			book_cate = "천애";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "【긴급 소환】을 사용해서 무작위로 특기를 선택할 때, 분야는 반드시 「꿈」이 된다. 2D6만 굴려 무작위 특기를 선택한다.";
			book_spell = "벗이여, 나의 꿈을 먹고 나타나라.";
			break;
		case "마법칼날":
			book_use = true;
			book_cate = "엽귀";
			book_type = "주문";
			book_spec = "절망";
			book_cost = "어둠 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 자신의 원형 1개체를 파괴하고 지정특기 판정을 한다. 판정에 성공하면 목표에게 파괴한 원형의 레벨+2점의 대미지를 입힌다.";
			book_spell = "그대는 나의 칼날. 베어 가르고, 찔러 꿰뚫어 처치하라!";
			break;
		case "오폭":
			book_use = true;
			book_cate = "엽귀";
			book_type = "주문";
			book_spec = "거짓";
			book_cost = "꿈 2";
			book_target = "적의 입회인 전원";
			book_effect = "1회 제한: 마법전\n 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다. 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 목표만이 대미지를 무효로 할 수 있다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "나 외눈이기에 정확히 겨냥할 수 없나니.";
			break;
		case "마법거울":
			book_use = true;
			book_cate = "엽귀";
			book_type = "주문";
			book_spec = "배신";
			book_cost = "어둠 3";
			book_target = "캐릭터 1명";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 습득한 장비 마법을 하나 선택한다. 이 마법전 동안 자신이 그 장비 마법을 습득한 것으로 간주한다.";
			book_spell = "현자의 샘이여. 수면에 비친 그 힘을 내게 다오!";
			break;
		case "보급":
			book_use = true;
			book_cate = "엽귀";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 대표인 상태에서 마법전을 종료하면, 임의의 마소나 【일시적 마력】을 1점 획득한다. 그 마법전에서 승리했다면 추가로 임의의 마소나 【일시적 마력】을 1점 획득한다.";
			book_spell = "굶주린 사냥개에게 약간의 보상을.";
			break;
		case "흉진":
			book_use = true;
			book_cate = "엽귀";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 1";
			book_target = "자신";
			book_effect = "마법전을 할 때, 원형을 소환한 라운드에는 자신의 【공격력】이 1점 상승한다.";
			book_spell = "이경의 향기, 전장의 흉흉한 공기를 장식하나니.";
			break;
		case "주문방해":
			book_use = true;
			book_cate = "엽귀";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 1";
			book_target = "없음";
			book_effect = "이 캐릭터가 대표인 마법전에서, 이 캐릭터 이외의 전원은 주문을 사용하기 위한 판정에 -1의 수정이 적용된다.";
			book_spell = "나, 천대를 받았으니 그에 상응하는 대접을 하리.";
			break;
		case "욕정":
			book_use = true;
			book_cate = "아방궁";
			book_type = "주문";
			book_spec = "에로스";
			book_cost = "짐승1";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자신의 소환 스텝에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 해당 라운드의 공격 스텝에서 주사위를 1개밖에 플롯할 수 없다. 그리고 그렇게 플롯한 주사위를 목표의 【공격력】과 같은 개수만큼 플롯한 것으로 간주한다.";
			book_spell = "문. 사랑의 주문, 문. (손가락을 여덞 개 세워 보이며)";
			break;
		case "영적질병":
			book_use = true;
			book_cate = "아방궁";
			book_type = "주문";
			book_spec = "부패";
			book_cost = "어둠1";
			book_target = "원형 1개체";
			book_effect = "마법전에서 자신의 소환 스텝에 사용할 수 있다. 지정특기 판정에 성공하면 목표를 사역하는 캐릭터는 그 라운드를 종료할 때 【마력】이 1점 감소한다.";
			book_spell = "예스, 팬데믹!";
			break;
		case "개조":
			book_use = true;
			book_cate = "아방궁";
			book_type = "주문";
			book_spec = "혼돈";
			book_cost = "짐승2";
			book_target = "자신의 원형 1개체";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 마법전 동안 목표에게 【블록2】, 【추가 대미지1】, 【캐스트】, 【워드6】 중 하나를 습득시킨다. 단, 이 효과로 그 원형이 원래 가지고 있는 이펙트와 같은 종류의 이펙트를 습득시킬 수는 없다.";
			book_spell = "세계의 불을 붙여라! 그 몸으로 혁명을 일으켜라!";
			break;
		case "전생":
			book_use = true;
			book_cate = "아방궁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "1회 제한: 세션\n자신이 운명의 힘을 사용해서 부활 판정을 할 때, 주사위를 굴리기 전이라면 그 판정에 무조건 성공할 수 있다.";
			book_spell = "목숨은 하나라고? 넌센스!";
			break;
		case "공각":
			book_use = true;
			book_cate = "아방궁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별1";
			book_target = "자신";
			book_effect = "세션 동안 자신이 【진정한 모습】을 해방할 수 있는 횟수가 1회 늘어난다(단, 같은 마법전 동안 【진정한 모습】을 두 번 해방할 수는 없다). 또, 세션을 개시할 때 【일시적 마력】을 1점 획득한다.";
			book_spell = "이소룡 가라사대 「생각하지 마라. 느껴라. 모든 것은 근원이 속삭이는 대로」";
			break;
		case "금주":
			book_use = true;
			book_cate = "아방궁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠1";
			book_target = "자신";
			book_effect = "션택: 세션을 개시할 때 / 자신과 다른 경력의 경력 마법이나 금서 마법 중 주문 타입의 마법 1종류 그 세션 동안 선택한 마법을 습득하고, 사용할 수 있게 된다.";
			book_spell = "천재란 비상한 지식에 깃드니, 이를 가리켜 비상식이라 하노라.";
			break;
		case "출구":
			book_use = true;
			book_cate = "문호";
			book_type = "주문";
			book_spec = "길";
			book_cost = "별 1";
			book_target = "단일";
			book_effect = "드라마 장면에서 누군가가 대미지를 받거나 상태이상에 걸릴 때 사용할 수 있다. 지정특기 판정에 성공하고 목표의 동의를 얻었다면, 목표를 그 장면에서 퇴장시킨다. 퇴장한 캐릭터는 대미지를 받거나 상태이상에 걸리지 않으며, 그 장면에는 다시 등장할 수 없다.";
			book_spell = "다음 역은 (텔레포트의 목적지). 나가실 문은 왼쪽입니다(이경에서는오른쪽).";
			break;
		case "망각":
			book_use = true;
			book_cate = "문호";
			book_type = "주문";
			book_spec = "눈물";
			book_cost = "노래 1";
			book_target = "본문 참조";
			book_effect = "마법전에서 〈단장〉을 상대로 승리했을 때 사용할 수 있다. 그 〈단장〉의 숙주를 목표로 선택한다. 목표가 「운명 변전 표」의 효과로 어떠한 재앙에 휘말렸을 경우, 지정특기 판정에 성공하면 그 재앙을 모두 제거할 수 있다.";
			book_spell = "오늘의 인생은 운행을 멈추고 쉬도록 하겠습니다.";
			break;
		case "유사":
			book_use = true;
			book_cate = "문호";
			book_type = "주문";
			book_spec = "대지";
			book_cost = "별 2";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 주고, 「봉인」 상태이상을 걸 수 있다.";
			book_spell = "현재 운행이 지연되고 있습니다.";
			break;
		case "비밀열쇠":
			book_use = true;
			book_cate = "문호";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "조사 판정에 성공하면, 그 판정에 사용한 주사위 눈에 대응하는 마소를 획득한다. 또, 조사 판정과 사건 판정에 +1의 수정을 적용한다.";
			book_spell = "다음 역은 종점인 (조사 판정의 목표 이름). 고객 여러분, 잊으신 말씀이 없는지 다시 한 번 확인해주시기 바랍니다.";
			break;
		case "인맥":
			book_use = true;
			book_cate = "문호";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "월경자와 마법전을 할 때, 목표에게 【추가 대미지2】를 부여한다. 또, 조사 판정과 조율 판정에 +1의 수정을 적용한다.";
			book_spell = "지금부터 이경의 이치에 접속하겠습니다.";
			break;
		case "약정":
			book_use = true;
			book_cate = "문호";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "노래 1";
			book_target = "자신";
			book_effect = "운명의 힘으로 「계약」을 할 때, 앵커의 【운명】 수치가 1점 높은 것으로 간주한다(【운명】이 5일 때는 6으로 간주한다).";
			book_spell = "가지고 계신 운명의 승차권을 확인하겠습니다.";
			break;
		case "가세":
			book_use = true;
			book_cate = "금서";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "지정특기 판정에 성공하면 합계 3레벨 이하의 조합으로 원형을 2개체 소환할 수 있다. 소환하는 원형의 상징은 양쪽 모두 지정특기와 같다(같은 카테고리 원형을 2개체 소환할 수는 없다).";
			book_spell = "입체 그림책처럼 튀어 나와라. 이것이야말로 방자한 여행자의 광시곡(랩소디)";
			break;
		case "포식":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 이 주문을 사용하기 위한 판정에는 목표의 원형 레벨만큼 마이너스 수정이 적용된다. 지정특기 판정에 성공하면 목표를 파괴하고, 자신은 목표의 레벨만큼 【일시적 마력】을 획득한다.";
			book_spell = "굴러 넘어지며 도망쳐라, 숫처녀처럼. 나는야 짐승, 숲속의 늑대.";
			break;
		case "모사":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "마법사 1명";
			book_effect = "1회 제한: 마법전\n 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 가진 【진정한 모습】의 효과를 자신이 발휘할 수 있다.";
			book_spell = "우리는 너구리, 거울에 비친 그 모습이 몹시 익숙하구나.";
			break;
		case "봉철":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "1회 제한: 마법전\n 마법전을 개시하고 첫 번째 라운드를 개시할 때 사용할 수 있다. 【진정한 모습】의 효과를 하나 선택한다. 그 마법전 동안 그 효과를 사용할 수 있다.";
			book_spell = "보고 싶니? 보고 싶지? 열어봐도 돼. 열어보렴.";
			break;
		case "비평":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 목표에게 2점의 대미지를 입힌다. 목표는 이 주문에 대해 저항판정을 시도할 수 있다. 이때는 무작위로 특기 하나를 선택해 지정특기로 사용한다.";
			book_spell = "너의 일거수 일투족, 그 전부가 시시하기 짝이 없도다!";
			break;
		case "폭음":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "마법사 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 마법에 충전한 마소를 1D6점 잃는다. 어느 마소를 잃을지는 목표가 결정할 수 있다. 만약 목표가 이 마법을 사용한 자의 영역과 같은 종류의 마소를 잃었다면, 마법을 사용한 자는 목표가 잃은 마소 1점당 【마력】 1점을 회복할 수 있다.";
			book_spell = "탐욕스러운 갈증. 마의 술잔을 허공에. 죽은 자의 피조차 환희.";
			break;
		case "낙서":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 세션 동안 자신이 습득한 마법을 원하는 만큼 미습득 상태로 되돌린다. 2레벨 이하에서 원하는 원형(상징은 이 마법의 지정특기와 같다)을 미습득 상태로 되돌린 마법의 수만큼 선택해서 소환할 수 있다.";
			book_spell = "나는 까다로운 예술가. 이 한 획이 이야기(패러다임)를 만들어낸다.";
			break;
		case "관통":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다. 이 주문으로 발생한 대미지에 대해서는 【블록】을 사용할 수 없다.";
			book_spell = "이것이야말로 사악한 품격.";
			break;
		case "영혼속박":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 장면 동안 목표가 「혼의 특기」를 사용할 수 없게 된다.";
			book_spell = "나는 감동적인 명작. 영혼을 붙잡아 놓아주지 않으리.";
			break;
		case "함정":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "자신에게 마법전을 건 캐릭터 전원";
			book_effect = "누군가가 자신에게 마법전을 신청했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표는 저항판정을 해야 한다. 저항판정에 실패한 캐릭터는 【마력】을 1D6점 감소하고 마법전을 할지, 마법전을 중지할지 선택할 수 있다. 중지를 선택한 캐릭터는 행동완료 상태가 된다(집단전일 때는 「사슬」에 묶인다).";
			book_spell = "어서 오세요, 도깨비집(오페라하우스)에! 눈알, 별, 장난감 상자!";
			break;
		case "허신":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 자신의 【마력】을 1~3점의 범위 내에서 원하는 만큼 소비한다. 지정특기 판정에 성공하면 목표에게 자신이 소비한 【마력】의 수치+1점의 대미지를 입힌다. 또, 이 주문에 대한 저항판정에는 소비한 【마력】만큼 마이너스 수정을 적용한다.";
			book_spell = "나는 칠흑의 페이지. 읽는 자를 새까맣게 칠해버린다.";
			break;
		case "개찬":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 목표에게 1점의 대미지를 입힌다. 목표는 이 주문에 대한 저항판정을 시도할 수 있다. 이때 사용할 특기로는 이 주문을 사용한 자가 자신이 습득한 특기 중에서 임의로 하나 선택한다(혼의 특기는 선택할 수 없다).";
			book_spell = "할아버지는 산에서 조난을 당해서, 할머니는 강에 빠져서 죽었답니다!";
			break;
		case "격리":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "마법사 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 「운명의 힘」을 사용할 수 없게 된다. 이 효과는 그 마법전 동안 지속된다.";
			book_spell = "빨강에 노랑과 하양, 검정에 파랑. 운명의 실을 자르는 재단 가위.";
			break;
		case "인질":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 자신이 3점의 대미지를 입을지, 아니면 운명 변전을 일으킬지 선택해야 한다(목표에게 앵커가 없다면 효과를 발휘하지 않는다).";
			book_spell = "내가 바로 정의의 천칭. 그대가 바라는 것에 벌을 내리겠도다.";
			break;
		case "시형":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "그 마법전에서 파괴되거나 소멸한 원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표와 같은 원형 1개체를 소환해서 사역할 수 있다. 이 효과는 마법전마다 같은 원형을 한 번씩만 소환할 수 있다는 제한을 목표당 1회씩 무시할 수 있다.";
			book_spell = "돌고 또 돌아라, 모독의 열쇠. 각인을 오염시켜라.";
			break;
		case "사첩":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득할 때 / 1~6까지의 숫자 중 1종류 이 마법을 습득한 캐릭터가 그 라운드에서 자신의 공격 스텝에 공격을 성공시켰을 때, 선택한 숫자와 같은 눈의 공격 주사위가 1개 이상 남아 있으면 【추가 대미지】가 1점 발생한다.";
			book_spell = "보이는구나. 옛날 이야기 속의 죽음 못지 않은 처참한 결말이.";
			break;
		case "난서":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터가 대표로 나선 마법전에서는 「후공 공격 스텝」 처리를 마친 뒤에 두 번째 「선공 공격 스텝」을 처리한다. 거기에 이어 두 번째 「후공 공격 스텝」을 처리하고, 그것이 끝나면 「라운드 종료」 처리를 한다.";
			book_spell = "나는 위대한 악문(걸작). 고고한 천재성은 누구도 이해하지 못하리.";
			break;
		case "망아":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "이 캐릭터가 대표로 나선 마법전에서, 이 캐릭터를 제외한 나머지는 소환을 사용하기 위한 판정에 -2의 수정을 적용한다.";
			book_spell = "친애하는 독자 제군, 나의 페이지 속에서 영원히 방황하시게나.";
			break;
		case "도망":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 〈단장〉이 메인 페이즈에서 마법전에 패배했을 때, GM은 「별」 분야에서 무작위로 특기를 하나 선택한다. 그 장면에 등장한 캐릭터 전원은 해당 특기로 판정해야 한다. 전원이 실패하면 그 〈단장〉은 도망치며, 프라이즈로 획득할 수 없게 된다. 도망친 〈단장〉은 PC의 앵커나 핸드아웃이 공개된 NPC에게 빙의하며, 다음 장면에는 【마력】이 1D6점 회복한다(누구에게 빙의했는지는 공개 정보로 처리한다. 【빙의 심도】를 사용한다면 그 수치는 1이 된다.)";
			book_spell = "비밀스럽고 어두컴컴한 길, 누구도 보지 않는 짐승들의 길.";
			break;
		case "관찰":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터가 마법전의 대표가 되었을 때, 적의 대표를 「관찰」한다. 마법전을 할 때, 적의 대표가 「관찰」한 적이 있는 캐릭터라면 이 〈단장〉이나 이 〈단장〉이 융합한 〈금서〉, 혹은 이 〈단장〉 이외의 〈단장〉에게 상대를 「관찰」한 횟수만큼의 【추가 대미지】가 발생한다.";
			book_spell = "흥미롭고도 빼어난 이 기예. 전하라, 퍼트려라, 대처하라.";
			break;
		case "흉조":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 캐릭터가 있는 장면에서 누군가가 판정에 실패하면, 그 실패를 펌블로 바꿀 수 있다.";
			book_spell = "떠올려라, 너의 마음을 무겁게 하는 그 말을. 청춘(과거)으로부터 되살아나는 끔찍한 한 마디를.";
			break;
		case "묘표":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "그 세션 동안 PC나 핸드아웃을 가진 NPC가 사망할 때마다 【일시적 마력】이 3점 상승하고, (만약 있다면) 【빙의 심도】가 1 상승한다.";
			book_spell = "장송의 기쁨. 어둠의 축복. 더 많은 죽음을! 더 많은 죽음을!";
			break;
		case "연옥":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 캐릭터가 공격에 성공해서 1점 이상의 대미지를 입혀 적 대표의 【마력】이 감소했을 때, 그 대표의 입회인은 피드백으로 감소하는 【마력】이 1점 늘어난다.";
			book_spell = "연소하라. 죽은 서경의 부패한 피여. 찌부러진 사서의 더렵혀진 눈물이여.";
			break;
		case "마술가시":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 캐릭터가 공격에 성공해서 1점 이상의 대미지를 입혀 적 대표의 【마력】이 감소했을 때, 그 대표와 그의 입회인은 대미지에 더해 1점의 마소를 잃는다.";
			book_spell = "씨앗이 여물어 터지며 자라난 독가시나무. 난잡하게 싹을 틔워 진을 치노니.";
			break;
		case "파멸":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 캐릭터의 공격이나 주문으로 사망한 캐릭터는 운명의 힘에 의한 부활 판정에 -2의 수정을 적용한다.";
			book_spell = "침묵의 탑에서 오라, 죽음의 왕이여. 장례식을 상징하는 새여.";
			break;
		case "요마가죽":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 캐릭터는 공격으로 입는 대미지를 1점 경감할 수 있다.";
			book_spell = "보라, 보라. 나를 감싸는 새빨간 장정(드레스), 서공의 사랑으로 물든 표지(베일).";
			break;
		case "검은책":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 〈단장〉이나 〈금서〉와 마법전을 해서 패배할 경우, 운명 변전이 1회 더 발생한다.";
			book_spell = "죄 없는 자의 외침이여, 울려퍼져라. 도리에 어긋난 눈물이여, 떨어져라.";
			break;
		case "소모":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "마법전 동안 적의 대표가 【마력】을 스스로 소비할 때마다, 그 입회인 전원에게 피드백이 발생하여 【마력】이 1점 감소한다.";
			book_spell = "나는 포학한 군주. 숨을 내쉴 때마다, 주장할 때마다 생명에 매긴 세금을 징수하노라.";
			break;
		case "책의그림자":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "마법전을 개시하고 첫 라운드를 개시할 때, 그 「단장」이 습득한 특기에 대응하는 「(특기명)의 기사」를 자동으로 소환한다.";
			book_spell = "어둠의 사서여, 그대가 책무를 다해야할 때가 왔노라.";
			break;
		case "백화사전":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 캐릭터가 판정에서 지정특기 대신 다른 특기를 사용할 경우, 목표치는 지정특기로부터 대신 사용하는 특기까지의 칸 수를 절반으로 나눈 값(나머지 올림)에 5를 더한 수치가 된다.";
			book_spell = "나는 이 자리에 깃든 악랄한 귀재, 페이지 위에서 춤추는 죽음과 재난.";
			break;
		case "서검소환":
			book_use = true;
			book_cate = "서적경";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "〈단장〉을 가지고 있으면 사용할 수 있다. 그 단장의 영역에서 2D6을 굴려 무작위로 특기를 하나 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 마검」을 소환할 수 있다.";
			book_spell = "마성의 페이지여, 예리한 철이 되어 적을 베어 넘겨라!";
			break;
		case "사탕발림":
			book_use = true;
			book_cate = "서적경";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "〈우자〉 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 그 세션 동안 상대의 마법사가 누구든 간에 운명의 힘을 빌려달라는 제안을 거절하며, 소원을 말하지 않는다.";
			book_spell = "장대한 기만. 성인의 속내. 파수꾼이 끌어안은 비밀. 그 진실을 가르쳐주리라.";
			break;
		case "흡마":
			book_use = true;
			book_cate = "서적경";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 공격할 때, 【추가 대미지X】를 얻는다. 이때, X는 그 라운드에 상대 진영 캐릭터가 소환을 사용한 횟수와 주문을 사용한 횟수를 합친 값과 같다.";
			book_spell = "마소의 재는 뜨겁고, 그 맛은 화륭의 고기 구이(스테이크)와도 같도다.";
			break;
		case "광기의생명":
			book_use = true;
			book_cate = "이상향";
			book_type = "주문";
			book_spec = "왜곡";
			book_cost = "없음";
			book_target = "〈우자〉 1명";
			book_effect = "「어둠」 영역의 〈단장〉을 가지고 있다면 드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공할 경우, 목표는 운명 변전으로 같은 불행을 거듭 겪었을 때를 제외하면 사망해도 「광기계 재액 (p90)」의 「운명 변전 표」를 1회 사용하면 부활할 수 있게 된다. 이 효과는 영원히 지속된다.";
			book_spell = "혼의 실이여. 늘고 줄며 생명을 이어 붙여라.";
			break;
		case "회생":
			book_use = true;
			book_cate = "이상향";
			book_type = "주문";
			book_spec = "치유";
			book_cost = "없음";
			book_target = "〈단장〉 1개체";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 목표의 【마력】을 최대치까지 회복할 수 있다.";
			book_spell = "나, 축복하노라. 어떠한 악이라 할지라도 생명은 생명이니.";
			break;
		case "불멸":
			book_use = true;
			book_cate = "이상향";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터는 마법전에서 패배했을 때, 마법전의 상대가 자신을 앵커로 두지 않은 캐릭터라면 자신에 대한 최후의 일격 선언을 금지할 수 있다. 반면, 이 캐릭터를 앵커로 둔 캐릭터는 설령 이 캐릭터가 사망하거나 소멸해도 상흔이 생기지 않는다.";
			book_spell = "그대, 나를 멸할 자격이 없음이니.";
			break;
		case "회신소환":
			book_use = true;
			book_cate = "분서관";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "이 마법을 사용했을 때, 자신의 장서에서 마법을 하나 선택한다. 그 마법은 해당 세션 동안 사용할 수 없다. 자신의 영역에서 2D6을 굴려 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 마왕」을 소환할 수 있다.";
			book_spell = "마도의 종착점은 악귀의 길. 똑똑히 보라, 진실을!";
			break;
		case "분서":
			book_use = true;
			book_cate = "분서관";
			book_type = "주문";
			book_spec = "불";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "「힘」 영역의 〈단장〉을 가지고 있다면 마법전에서 자기 차례가 되었을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에서 2점의 대미지를 입히거나, 「봉인」 상태이상을 걸 수 있다.";
			book_spell = "죄의 불에서 태어난 자여, 순리에 따라 재로 돌아가라!";
			break;
		case "화염의몸":
			book_use = true;
			book_cate = "분서관";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "【진정한 모습】을 발휘하고 있을 동안, 원래의 효과에 더해 【추가 대미지】가 1점 상승한다.";
			book_spell = "불을 숭배하는 가르침, 아후라마즈다의 축복.";
			break;
		case "성령소환":
			book_use = true;
			book_cate = "구세계질서";
			book_type = "소환";
			book_spec = "별";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "「별」 영역의 〈단장〉을 가지고 있다면 사용할 수 있다. 「별」 영역에서 2D6을 굴려 무작위로 특기를 하나 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 (임의로 선택한 2레벨 이하의 원형)」을 소환할 수 있다.";
			book_spell = "지난 날의 칠석 때처럼, 우리는 만나리라.";
			break;
		case "부서지는닻":
			book_use = true;
			book_cate = "구세계질서";
			book_type = "주문";
			book_spec = "심연";
			book_cost = "없음";
			book_target = "마법사 1명";
			book_effect = "「어둠」 영역의 〈단장〉을 가지고 있다면 사용할 수 있다. 드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 운명 변전이 발생한다.";
			book_spell = "계약을 관장하는 여신의 질투는 결코 끊이는 일이 없을지니.";
			break;
		case "외투":
			book_use = true;
			book_cate = "구세계질서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이경에 있을 때, 이 캐릭터는 「불간섭」 이외의 세계 법칙에는 영향을 받지 않는다.";
			book_spell = "나는 신이요, 나는 법이로다.";
			break;
		case "천칭":
			book_use = true;
			book_cate = "어둠의 심장";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "1회 제한: 마법전\n 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표와 자신의 【마력】을 더한 후 2로 나눈 수치를 산출한다(【일시적 마력】이 있다면 그것도 더한다. 소수점 이하 올림). 목표와 자신의 【마력】 최대치와 현재치가 그 수치로 변한다.";
			book_spell = "뼈와 힘줄의 맹약. 문서 없는 옛 계약을 따르라.";
			break;
		case "촉수":
			book_use = true;
			book_cate = "어둠의 심장";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 습득한 주문 하나를 선택한다. 목표에게 1점의 대미지를 입히고, 그 라운드 동안 목표가 그 주문을 사용할 수 없게 된다.";
			book_spell = "속박의 저주가 되어라, 꺼림칙한 살의 덩굴이여.";
			break;
		case "이질적인언어":
			book_use = true;
			book_cate = "어둠의 심장";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "「노래」 영역의 〈단장〉을 가지고 있다면 사용할 수 있다. 공격으로 적 대표의 【마력】을 1점 이상 감소했다면, 그 라운드에 사용할 수 있는 주문의 횟수가 1회 증가한다(이름이 같으 마법에 대한 사용 제한은 적용한다).";
			book_spell = "이리 나오라, 입술의 악단.";
			break;
		case "장난":
			book_use = true;
			book_cate = "혼혈주의자";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "판정에 실패한 캐릭터 1명";
			book_effect = "누군가가 판정에 실패했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다.";
			book_spell = "미치광이 극장! 잠들어라, 굴러라, 떨어져라, 웃어라!";
			break;
		case "지뢰":
			book_use = true;
			book_cate = "혼혈주의자";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "판정에 펌블을 낸 캐릭터 1명";
			book_effect = "누군가가 판정에서 펌블을 발생시켰을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 2점의 대미지를 입힌다.";
			book_spell = "터져라, 만민의 조소! 울려라, 악의의 갈채!";
			break;
		case "덮어쓰기":
			book_use = true;
			book_cate = "혼혈주의자";
			book_type = "주문";
			book_spec = "광기";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "「꿈」 영역의 〈단장〉을 가지고 있다면 사용할 수 있다. 자기 차례가 되었을 때, 자신이 이경에 있다면 사용할 수 있다. 그 이경의 세계 법칙을 하나 선택한다. 지정특기 판정에 성공하면 그 장면 동안 선택한 세계 법칙을 다른 세계 법칙으로 변경할 수 있다.";
			book_spell = "점잔 뺄 것 없도다, 세계여. 처녀와 같이 나의 색으로 물들어라.";
			break;
		case "피의사도":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "피";
			book_cost = "짐승 2";
			book_target = "자신의 앵커 1명";
			book_effect = "습득 제한: 흡혈귀, 누적 불가 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 그 세션 동안 운명의 힘 「영체화」를 사용해서 목표가 원형으로 변화했을 때, 그 원형이 【추가 대미지】를 습득하지 않았다면 【추가 대미지1】을 습득한다. 「영체화」로 변화한 원형이 이미 【추가 대미지】를 습득하고 있다면 해당 수치가 1 상승한다. 또, 그 세션 동안 목표의 도움을 받아 운명의 힘 「부활」을 사용할 수 없게 된다.";
			book_spell = "그 그림자와 맞바꿔 붉은 인연의 서약을. 그대, 나의 종복이 되어라.";
			break;
		case "혈계":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 2";
			book_target = "자신";
			book_effect = "습득 제한: 흡혈귀 마법전에서 라운드 개시의 효과로 마소를 획득했을 때, 그 타이밍에 획득한 마소를 1점 소비할 때마다 자신의 【마력】을 1점 회복할 수 있다. 이때, 【마나】 이펙트로 획득한 마소를 소비해서 【마력】을 회복하지 못한다.";
			book_spell = "피의 왕관의 이름으로. 나의 피가 물결치며 흐르는 왕의 땅이 되리라.";
			break;
		case "입맞춤":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 2";
			book_target = "자신";
			book_effect = "습득 제한: 흡혈귀·백작 이상 자신이 운명의 힘 「부활」을 사용할 때, 자신의 <우자> 앵커 1명을 사망시킬 수 있다. 자신의 「부활」은 자동으로 성공하고, 해당 앵커는 상흔이 된다.";
			book_spell = "그대, 내게 영원을 가져다주는 아름다운 장미여. 마지막 입맞춤을 나누자꾸나.";
			break;
		case "용경":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "원환";
			book_cost = "힘 2";
			book_target = "자신";
			book_effect = "습득 제한: 용종·백장 이상 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 해당 라운드 동안 목표의 공격에 의한 대미지에 대해 【블록】을 사용할 수 없게 된다.";
			book_spell = "회전하라, 용의 고리(우로보로스). 순환하라, 일곱 개의 용혈(차크라).";
			break;
		case "용의숨결":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "힘";
			book_cost = "힘 3";
			book_target = "단일";
			book_effect = "습득 제한: 용종, 3회 제한: 세션 / 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 자신의 현재 【마력】 수치를 절반으로 나눈 만큼 대미지를 목표에게 입힐 수 있다(소수점 이하 올림. 【일시적 마력】은 포함되지 않는다).";
			book_spell = "받아라, 나의 숨결을.";
			break;
		case "역린":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 2";
			book_target = "자신";
			book_effect = "습득 제한: 용종, 누적 불가 마법전 중에 대미지로 인해 자신의 【마력】이 감소했을 때, 그 마법전 동안 자신에게 【추가 대미지1】이 부여되고, 자신이 주문으로 대미지를 입힐 때 해당 대미지가 1점 상승한다.";
			book_spell = "이제부터는, 말은 필요 없노라.";
			break;
		case "실추":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "어둠 2";
			book_target = "제3계제 이상의 마법사나 단장 1명";
			book_effect = "습득 제한: 악마 누군가가 판정을 위해 주사위를 굴리기 직전에 사용할 수 있다. 그 판정의 주사위 눈 합계치가 목표의 【공격력】 이하였다면 해당 판정은 펌블이 된다. 단, 목표의 【공격력】이 6 이상이었다면 주사위 눈의 합계치가 6 이상일 경우 펌블이 되지 않는다(5 이하라면 펌블이 된다).";
			book_spell = "떨어져라, 종극의 심연으로. 광대와 어리석은 무리들의 조소가 그대를 애타게 기다리고 있으니.";
			break;
		case "재보":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "습득 제한: 악마 도입 페이즈에 마화를 2점 획득한다. 이 효과로 획득한 마화는 클라이맥스 페이즈가 종료되면 없어진다. ";
			book_spell = "쌍두룡과 흑마에 올라탄 이들에게 가르치리. 황금과 백은을 부르는 복이 있으라.";
			break;
		case "수확":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "습득 제한: 악마·백작 이상 종료 페이즈의 「의무 확인」 타이밍에서 자신이 「소원」을 이루어준 <우자> 앵커 1명을 사망시킬 수 있다. 자신은 그 앵커의 【운명】과 같은 수치의 공적점을 획득하고, 해당 앵커는 상흔이 된다.";
			book_spell = "위대한 (PC의 작위, PC의 이름)의 이름으로, 그대의 소원은 똑똑히 들었노라. 파우스트의 양피지에 계약의 이름을 새겨라.";
			break;
		case "깜짝":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "노래 1";
			book_target = "캐릭터 1명";
			book_effect = "습득 제한: 요정 마법전을 할 때, 목표가 무언가 판정에 성공했을 때 사용할 수 있다. 목표에게 무작위로 상태이상 하나를 건다.";
			book_spell = "호오호오호오! 말릴 수 없는, 꿈을 꿈답게 만드는 이 광신!";
			break;
		case "이웃":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "노래 1";
			book_target = "자신";
			book_effect = "습득제한: 요정 자신이 소환한 「정령」은 【워드7】의 이펙트를 습득한다.";
			book_spell = "얼굴이 셋 달린 마법의 여신(헤카테)의 마차로 불려가, 꿈을 꾸듯이 어둠을 쫓도다. 우리의 벗이 신이 나서 떠들어댈 대.";
			break;
		case "은신도롱이":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "노래 2";
			book_target = "자신";
			book_effect = "습득 제한: 요정·백작 이상 마법전을 하는 동안 자신의 「정령」 원형을 사역하는 경우, 자신이 방어를 할 때 3개의 주사위를 사용해서 집중 방어를 할 수 있다(3개의 주사위를 위아래로 쌓는다. 그 세 개의 주사위와 눈이 같은 공격 주사위는 몇 개든지 제거할 수 있다).";
			book_spell = "엔디미온에게 입맞춤을. 그 눈에도 입맞춤을. 그리고 밤의 장막에 숨어버리자.";
			break;
		case "잠의유혹":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "잠";
			book_cost = "꿈 2";
			book_target = "원형을 원하는 만큼";
			book_effect = "습득 제한: 몽마·백작 이상 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 그 라운드 동안 【부스트】와 【블록】 이펙트를 사용할 수 없게 된다(【블록】을 습득하고 있는 목표에게 다른 캐릭터가 주문 등을 사용해서 대미지를 입히는 것은 가능). 이 마법에 대한 저항 판정은 목표마다 개별적으로 하며, 성공한 목표만이 【부스트】와 【블록】을 사용하지 못하게 하는 효과를 무효로 할 수 있다. 저항 판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "꽃이여, 새여, 바람이여. 잠들어라, 잠들어라, 나의 아이.";
			break;
		case "소몽":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "습득 제한: 몽마 자신이 사역하는 「악몽」이 【마이너스】 이펙트를 사용한 판정이 실패했을 때, 판정을 한 캐릭터는 1점의 대미지를 입는다.";
			book_spell = "마치 무더위와 같이 사라지지 않는 욕망의 대해에 빠져 익사하라.";
			break;
		case "번뇌의꿀":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 2";
			book_target = "자신";
			book_effect = "습득 제한: 몽마 자신이 등장한 장면에서 자신 이외의 캐릭터가 판정에 실패했을 때, 자신의 【마력】을 1점 회복할 수 있다.";
			book_spell = "아아, 폐최가 가져다주는 있는 그대로의 자극. 오뇌의 달콤한 향기.";
			break;
		case "재앙":
			book_use = true;
			book_cate = "종족";
			book_type = "주문";
			book_spec = "이계";
			book_cost = "별 1";
			book_target = "단일";
			book_effect = "습득 제한: 토지신·백작 이상 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힐 수 있다. 그 세션 동안 목표가 자신의 앵커에게 불행을 가져다 주었거나, 목표가 자신에게 1점 이상 대미지를 입혔다면 이 주문의 대미지가 2점 상승한다(조건을 여럿 충족해도 상승하는 대미지는 2점까지).";
			book_spell = "위대한 이 땅의 여러 신께 감히 청하옵니다. 원수에게 그 죄를 벌할 재앙을 내려주시옵소서.";
			break;
		case "세력권":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "조사 결과 판명한 마법 생물 1개체";
			book_effect = "습득 제한: 토지신 자신이 조사에 성공했을 때, 그 조사의 목표가 마법생물 또는 마법생물에게 빙의당한 존재라면 목표에게 2점의 대미지를 입힐 수 있다.";
			book_spell = "바로 눈앞에 있더라도, 한 곳에 괴지 않으면 더럽혀질 일은 없을 것이니.";
			break;
		case "가호":
			book_use = true;
			book_cate = "종족";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 2";
			book_target = "아군 대표 1명";
			book_effect = "습득 제한: 토지신 자신이 입회인인 마법전에서는 목표에게 【워드7】이 부여된다.";
			book_spell = "물고기, 짐승, 새의 영험함으로 빛을 비춰, 온갖 재앙과 죄와 더러움을 없애소서. 정화하소서.";
			break;
		case "입회인소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "길";
			book_cost = "없음";
			book_target = "그 마법전에 등장하지 않은 마법사 1명";
			book_effect = "지정특기 판정에 성공하고, 목표의 동의를 얻으면 목표를 자신의 입회인으로 소환할 수 있다.";
			book_spell = "함께 공훈을 나누어 가지리. 울려라, 우리의 조화(하모니)";
			break;
		case "호법소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 1";
			book_target = "없음";
			book_effect = "이 마법은 자신이 「마검」이나 「정령」, 또는 「악몽」 원형을 사역하고 있을 때만 사용할 수 있다. 지정특기 판정에 성공하면 이번 라운드 동안 자신이 사역하는 「마검」이나 「정령」, 또는 「악몽」에게 각각 【부스트1】이 부여된다. 이 【부스트1】 이펙트는 방어 주사위를 추가로 굴리는 용도로만 사용할 수 있다.";
			book_spell = "연회에 초대 받았으니 손님 또한 치장을 해야 마땅하니.";
			break;
		case "기병소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 2";
			book_target = "없음";
			book_effect = "이 마법은 자신이 「전차」 원형을 사역하고 있을 때만 사용할 수 있다. 지정특기 판정에 성공하면 「(특기명)의 기사」를 소환할 수 있다. 이 판정에는 +1의 수정을 적용한다. 또, 그 라운드 동안 자신이 사역하는 「전차」 1개체에게 【추가 대미지1】이 발생한다.";
			book_spell = "기수와 기마가 함께 하는 모습은 마치 비익조와 같도다.";
			break;
		case "판도소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "";
			book_cost = "특기분야 3";
			book_target = "없음";
			book_effect = "이 마법은 자신이 「마왕」 원형을 사역하고 있을 때만 사용할 수 있다. 지정특기 판정에 성공하면 「(특기명)의 왕국」을 소환할 수 있다. 이 판정에는 +1의 수정을 적용한다. 또, 원한다면 그 장면에 「주문 활성」 세계 법칙을 추가할 수 있다.";
			book_spell = "진군의 나팔 소리가 드높도다. 왕의 위광을 널리 알릴지어다.";
			break;
		case "마도구소환":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "황금";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "지정특기 판정에 성공하면 아이템을1종류 선택한다. 그 아이템의 필요 공적점에서 1점을 뺀 수치만큼 공적점이나 마화를 소비하면, 그 아이템을 1개 획득한다(필요 공적점은 0 이하가 되지 않는다). 그 장면을 종료하면 해당 아이템은 없어진다.";
			book_spell = "황금색 벌꿀술로 이 잔을 가득 채우리.";
			break;
		case "강등":
			book_use = true;
			book_cate = "범용";
			book_type = "소환";
			book_spec = "나태";
			book_cost = "어둠 1";
			book_target = "원형 1개체";
			book_effect = "지정특기 판정에 성공하면 목표를 원래의 레벨보다 1레벨 낮은 다른 원형으로 변화시킨다(상징은 변하지 않는다). 이때, 목표가 원래 입었던 대미지는 모두 없어진다.";
			book_spell = "사랑스러운 나의 새신부를 수자(새틴)로 만든 장식끈(리본)으로 묶어볼까.";
			break;
		case "영기":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "태양";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "자신의 주권에 원형이 소환되었을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표의 【마력】을 1점 회복한다.";
			book_spell = "부어라, 부어라, 올코올. 그 몸이 영웅 호걸로 변할 때까지.";
			break;
		case "급습":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "";
			book_cost = "별 1";
			book_target = "자신의 앵커에게 빙의한 <단장> 1개체";
			book_effect = "자신이 자신의 앵커를 목표로 하는 조사 판정에 성공했고, 그 앵커가 <단장>에게 빙의당했다는 것이 판명되었을 때 사용할 수 있다. 자신의 【마력】을 1점 소비하고, 목표가 습득한 특기를 지정특기로 삼아 판정한다(특기를 여러 개 습득하고 있다면 주문 사용자가 그중에서 특기를 하나 선택한다). 지정특기 판정에 성공하면 그 <단장>에게 마법전을 신청할 수 있다.";
			book_spell = "날아라, 매여. 우레보다 빠르게. 승리의 함성을 울려라.";
			break;
		case "흑풍":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "폭풍";
			book_cost = "별 1";
			book_target = "아군 대표 1명";
			book_effect = "누적 불가\n 입회인 자신이 입회인일 때, 아군 대표가 공격 주사위를 플롯하기 직전에 사용할 수 있다. 자신의 【마력】 1점을 소비해서 지정특기 판정에 성공하면 그 라운드 동안 목표에게 【추가 대미지1】아 부여된다.";
			book_spell = "미쳐 날뛰어라, 거칠게 불어닥쳐라.";
			break;
		case "제령":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "가변";
			book_cost = "짐승 2";
			book_target = "정령을 2개체까지 원하는 수만큼";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 짐승 분야에서 무작위로 특기 하나를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 목표를 파괴한다.";
			book_spell = "여기는 청정한 장소이니, 물러가라! 물러가라! 물러가라!";
			break;
		case "봄의비술":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "에로스";
			book_cost = "짐승 2";
			book_target = "자신 이외의 캐릭터를 원하는 수만큼";
			book_effect = "자기 차계에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 《에로스》 판정을 해야 한다. 이 판정에 성공한 캐릭터는 아무거나 마소를 1개 획득한다.";
			book_spell = "침상에서 기다려라, 나이팅게일. 신묘한 노랫소리를 내려주리.";
			break;
		case "성원":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "외침";
			book_cost = "짐승 2";
			book_target = "아군 대표 1명";
			book_effect = "2회 제한: 세션, 입회인 자신이 입회인일 때, 아군 대표가 판정을 위해 주사위를 굴린 직후에 사용할 수 있다. 지정특기 판정에 성공하면 그 판정의 주사위를 다시 굴릴 수 있다. ";
			book_spell = "닿아라, 필승의 외침. 혼이 으르렁거리는 소리. 생명의 메아리,";
			break;
		case "퇴거":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "중력";
			book_cost = "힘 1";
			book_target = "적 입회인 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 그 마법전의 입회인을 그만두게 하고, 그 장면에서 퇴장시킨다.";
			book_spell = "음험한 여주인의 힘을 빌려, 두 사람의 모습을 가장 깊숙한 장소로.";
			break;
		case "저주해제":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "자유";
			book_cost = "힘 1";
			book_target = "캐릭터 1명";
			book_effect = "드라마 장면에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 걸린, 그 세션 동안 지속되는 주문의 효과를 모두 무효로 한다.";
			book_spell = "풀려라, 쇠사슬. 그대는 부정한 자. 이 증명서에는 가치가 없으니.";
			break;
		case "답례":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "원환";
			book_cost = "힘 2";
			book_target = "적 대표 1명";
			book_effect = "입회인\n자신이 입회인일 때, 자신의 방어 주사위로 적의 공격 주사위를 1개 이상 제거했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힐 수 있다.";
			book_spell = "돌아라, 인과의 수레바퀴. 깨져라, 역심의 화신.";
			break;
		case "고립":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "이별";
			book_cost = "노래 1";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 「차단」 상태 이상을 건다.";
			book_spell = "자아(셀프)와 영혼(소울)을 분할하여. 고상한 그대여, 고독해지리라.";
			break;
		case "은막":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "이야기";
			book_cost = "노래 2";
			book_target = "자기 앵커를 원하는 수만큼";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 자신과 목표 사이의 【운명】을 1 감소한다. 또, 그 세션 동안 목표에게 운명 변전에 의한 불행이 닥쳤을 때 1D6을 굴린다. 그 결과가 자신과 목표의 【운명】 이하라면 해당하는 불행을 모두 무효로 할 수 있다.";
			book_spell = "자, 어서 옵쇼. 어서 옵쇼. 이제부터 시작되는 공절전후의 대모험, 관람료는 보고 마음에 들면 지불하셔도 충분하외다.";
			break;
		case "전우":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "승리";
			book_cost = "노래 2";
			book_target = "자신";
			book_effect = "1회 제한: 세션\n입회인 자신이 입회인이고, 마법전을 종료할 때, 아군 대표가 마법전에 승리했다면 사용할 수 있다. 지정특기 판정에 성공하면 아군 대표를 목표로 「사건 표」를 한 번 사용할 수 있다.";
			book_spell = "단단히 묶인 인과의 실이여, 네가 끊어지는 그 밤까지 우리를 이어다오.";
			break;
		case "출제":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "수수께끼";
			book_cost = "꿈 2";
			book_target = "적 대표 ";
			book_effect = "누적 불가\n마법전에서 자신의 차례에 사용할 수 있다. 지정특기 판정에 성공하면 1~6의 숫자 중 하나를 선택한다. 목표는 그 라운드에 공격할 때, 선택한 숫자를 플롯할 수 없다. 주사위를 무작위로 플롯할 때나 【부스트】처럼 공격 주사위를 추가하는 효과에서 해당하는 숫자가 나오면 그 주사위를 제거한다.";
			book_spell = "맞혀 보려무나. 주사위 놀이, 운 게임, 괴물이 숨어든 숨바꼭질.";
			break;
		case "회오":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "불안";
			book_cost = "꿈 2";
			book_target = "자신";
			book_effect = "마법전 동안 자신이 공격 주사위를 공개한 직후에 사용할 수 있다(「계약」이나 【부스트】처럼 공격 주사위를 추가하는 효과를 사용한 후에는 사용할 수 없다). 지정 특기 판정에 성공하면 그 공격 주사위를 모두 한 번씩 다시 굴린다.";
			book_spell = "마음에 장막을 칠 때, 그림자여! 주먹을 휘둘러라!";
			break;
		case "창화":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "기도";
			book_cost = "꿈 2";
			book_target = "아군의 대표 1명";
			book_effect = "누적 불가\n 입회인 자신이 입회인이고, 아군 대표가 주문을 사용할 때 사용할 수 있다. 지정특기 판정에 성공하면 해당 주문 판정에 +1의 수정을 적용하며, 그 주문에 대한 저항 판정에 -1의 수정을 적용한다.";
			book_spell = "그림자가 되어 함께 하리, 그대가 노래하는 대로. ";
			break;
		case "게으름":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "나태";
			book_cost = "어둠 1";
			book_target = "자신";
			book_effect = "입회인\n자신이 입회인일 때, 공격 주사위나 방어 주사위를 플롯하기 직전에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 그 라운드의 플롯을 멈추고, 【마력】을 1점 회복한다. 또, 그 라운드 동안 목표에게는 피드백이 발생하지 않는다.";
			book_spell = "난롯가에서 쉬던 그 때를 그리워하며, 잠시나마 눈을 붙여보기를.";
			break;
		case "반란":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "배신";
			book_cost = "어둠 2";
			book_target = "적이 사역하는 원형을 원하는 만큼";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 저항에 실패한 목표의 수만큼 목표를 사역하는 캐릭터 한 명에게 대미지를 입힌다. 이 마법에 대한 저항판정은 목표마다 개별적으로 한다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다. 목표 전원이 저항에 실패하면 입히는 대미지가 1점 상승한다.";
			book_spell = "횃불을 들어올려 불을 질러라! 대포 소리로 하늘을 뒤흔들어라!";
			break;
		case "기문":
			book_use = true;
			book_cate = "범용";
			book_type = "주문";
			book_spec = "방황";
			book_cost = "어둠 2";
			book_target = "적의 원형 1개체";
			book_effect = "입회인\n자신이 입회인일 때, 아군 대표가 소환 스텝에서 소환 타입 마법을 사용하지 않았다면 사용할 수 있다. 자신의 【마력】 1점을 소비하고 판정에 성공하면 목표가 가진 이펙트 하나를 선택한다. 그 라운드 동안 목표는 이펙트를 사용할 수 없다.";
			book_spell = "아홉 진 중 네 진을 정(正)으로, 네 진을 기(奇)로 삼고, 나머지를 한 진으로 기회를 장악하라.";
			break;
		case "영력갑주":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "자기영역 2";
			book_target = "자신";
			book_effect = "마법전 동안 자신의 영역에 대응하는 숫자의 방어 주사위로 공격 주사위를 제거할 때, 그 방어 주사위 하나당 공격 주사위 2개를 제거할 수 있다.";
			book_spell = "빛나는 영혼으로 옷을 짜리라.";
			break;
		case "고검":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "이 캐릭터가 대표를 맡은 마법전에서 자신이 원형 1개체도 사역하지 않을 때, 자신에게 【추가 대미지1】을 부여한다.";
			book_spell = "달빛이여, 고고한 기영(騎影)을 지켜주오.";
			break;
		case "꽃의투구":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 2";
			book_target = "자신";
			book_effect = "자신이 주문의 지정특기 판정에서 스페셜을 발생시켰을 때, 거기에 대한 저항판정의 결과가 스페셜이 아닌 한 저항은 실패하며 주문을 무효화할 수 없다.";
			book_spell = "벚꽃, 귤꽃, 모란, 장미. 화관이여, 화려하게 피어나라.";
			break;
		case "탄막":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "힘 2";
			book_target = "자신";
			book_effect = "마법전 동안 자신이 공격할 때, 공격 주사위를 무작위로 플롯할 수 있다. 공격 주사위를 무작위로 플롯했다면, 그 이후 라운드에 입는 대미지를 1점 경감할 수 있다(이 효과로 대미지를 1점 이상 경감할 수는 없으며, 입는 대미지를 1점 미만으로 만들 수도 없다).";
			book_spell = "팔맷돌이여. 베일처럼 가볍게, 나의 몸을 지켜라!";
			break;
		case "소취":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 1";
			book_target = "자신";
			book_effect = "이 캐릭터가 대표를 맡은 마법전의 경우, 【마이너스】 이펙트를 습득하지 않은 원형은 소환된 다음 라운드가 되기 전까지는 모든 이펙트를 사용할 수 없다.";
			book_spell = "잔을 들어올리고 맞이하라. 취객의 가호를 그대에게 바치나니.";
			break;
		case "독창적주문":
			book_use = true;
			book_cate = "범용";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 2";
			book_target = "자신";
			book_effect = "1회 제한: 세션\n주문을 사용했을 때, 그 주문의 지정특기를 자신의 「혼의 특기」로 변경한다. 그 주문의 목표가 저항을 할 경우, 저항 판정의 목표치는 12가 된다(단, 목표가 저항 판정에 「혼의 특기」를 사용한다면 목표치는 6이 된다). 이 마법을 사용한 자와 영역이 같은 자는 이 주문에 대해 【워드】의 효과를 사용할 수 있다.";
			book_spell = "식자를 능가하는 요술 솜씨, 구경해 보시라.";
			break;
		case "반사":
			book_use = true;
			book_cate = "원탁";
			book_type = "주문";
			book_spec = "";
			book_cost = "힘 2";
			book_target = "주문을 사용한 캐릭터 1명";
			book_effect = "입회인\n자신이나 아군의 대표가 주문 저항에 성공했을 때 사용할 수 있다. 저항한 주문의 지정특기가 이 주문의 지정특기가 된다. 지정특기 판정에 성공하면 그 주문으로 자신이나 아군의 대표가 입을 예정이었던 만큼의 대미지를 목표에게 입힌다. 이 효과로 대미지 이외의 효과를 가할 수는 없다.";
			book_spell = "잔혹한 월면에 그대의 악의를 비추노라. 월영은 어디까지라도 그대를 쫓으리.";
			break;
		case "구호":
			book_use = true;
			book_cate = "원탁";
			book_type = "주문";
			book_spec = "치유";
			book_cost = "노래 1";
			book_target = "아군 대표";
			book_effect = "입회인\n자신이 입회인일 때, 자신의 방어 주사위로 적의 공격 주사위를 1개 이상 제거했다면 사용할 수 있다. 지정특기 판정에 성공하면 목표의 【마력】을 1점 회복한다. 이 주문은 자신이 한 번 이상 마법전의 대표가 되면 그 세션에서는 더 이상 사용할 수 없다.";
			book_spell = "칼은 장미로, 장미는 과실로, 과실은 당신의 입술로.";
			break;
		case "쫓아오는죽음":
			book_use = true;
			book_cate = "원탁";
			book_type = "주문";
			book_spec = "죽음";
			book_cost = "어둠 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다. 자신이 목표에게 한 번 승리한 적 있거나, 자신이 회수한 <단장>으로 구성된 <금서>가 목표일 때는 이 대미지가 2점 상승한다.";
			book_spell = "자, 먹어라. 여기에 새롭게 싹을 틔운 죽음이 있노니.";
			break;
		case "후배소환":
			book_use = true;
			book_cate = "학원";
			book_type = "소환";
			book_spec = "길";
			book_cost = "별 2";
			book_target = "없음";
			book_effect = "1회 제한: 세션\n제작: 습득할 때/제1계제의 마법사 이 마법은 습득할 때 「낮은 계제의 마법사」 규칙에 따라 제1계제의 캐릭터(NPC)를 제작한다(공적점은 사용할 수 없다). 지정특기 판정에 성공하면 그 마법전 동안 해당 NPC를 자신의 입회인으로 삼아 플롯을 제외한 조작을 한다. 그 NPC의 플롯은 입회인으로 참가하지 않은 플레이어가 한다. 모든 플레이어가 참가했다면 GM이 무작위로 처리한다.";
			book_spell = "가시덤불로 보일지라도, 이곳은 빛나는 길. 지금이야말로 문이 열릴 것이니.";
			break;
		case "교가":
			book_use = true;
			book_cate = "학원";
			book_type = "주문";
			book_spec = "승리";
			book_cost = "노래 1";
			book_target = "자신";
			book_effect = "2회 제한: 세션 자신의 【마력】이 2점 이하라면 아무 때나 사용할 수 있다(【일시적 마력】이 있다면 그것까지 더한 수치가 2점 이하일 때. 0점일 때는 사용할 수 없다). 지정특기 판정에 성공하면 자신의 【마력】을 1D6점 회복한다.";
			book_spell = "세상의 눈이 닿지 않는 학사에서 책상을 나란히 하는 형제와의 굳건한 인연은 영원할지니.";
			break;
		case "분교":
			book_use = true;
			book_cate = "학원";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "선택: 세션을 개시할 때/자신이 습득 가능한 마법 1종류 그 세션 동안 선택한 마법을 습득해서 사용할 수 있다. 또, 그 마법의 지정특기를 「혼의 특기」, 「가변」 외의 원하는 것으로 변경할 수 있다. 그 마법의 코스트가 「없음」이 아니라면, 코스트의 종류를 「전」 이외의 무언가로 변경할 수 있다(이 효과로 코스트의 수치를 변경할 수는 없다).";
			book_spell = "같은 줄기에서 갈라져 피어난 꽃처럼, 지금은 멀어진 그대 또한 동포로다. 그 열매, 나눌지어다.";
			break;
		case "심연엿보기":
			book_use = true;
			book_cate = "천애";
			book_type = "주문";
			book_spec = "심연";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "도입 페이즈를 개시할 때 사용할 수 있다. 지정특기 판정에 성공하면 그 세션에 사용할 핸드아웃 중에서 무작위로 1장을 골라 그 【비밀】을 본다(【개요】는 보지 못한다). 이 주문의 사용자는 그 【비밀】의 내용이 다른 PC에게 밝혀질 때까지 다른 사람에게 해당 내용을 알릴 수 없다. 이 주문의 사용자가 그 내용을 누설했다고 GM이 판단할 때마다 이 주문의 사용자는 2D6점의 【마력】을 잃는다.";
			book_spell = "고고한 새여, 무덤으로 향하라. 거기에 잠든 비보를 찾아, 가지고 돌아오라!";
			break;
		case "영사":
			book_use = true;
			book_cate = "천애";
			book_type = "주문";
			book_spec = "수수께끼";
			book_cost = "꿈 1";
			book_target = "적 대표";
			book_effect = "입회인\n마법전을 개시할 때 사용할 수 있다. 지정특기 판정을 한다. 이 주문을 사용한 자의 【공격력】보다 목표의 【방어력】이 높다면 그 차이만큼 지정특기 판정에 마이너스 수정을 적용한다. 지정특기 판정에 성공하면 목표의 비공개 데이터를 공개한다.";
			book_spell = "카드, 점대, 수정석과 수면. 나에게 보여다오, 그림자의 이면을.";
			break;
		case "점복":
			book_use = true;
			book_cate = "천애";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "꿈 1";
			book_target = "없음";
			book_effect = "5회 제한: 세션 자신 이외의 누군가가 판정을 위해 주사위를 굴리기 직전에 사용할 수 있다. 그 판정이 성공할지 실패할지 예상한다. 판정 결과가 예상과 일치한다면 자신의 【마력】을 2점 회복한다. 판정 결과가 예상과 다르다면 자신의 【마력】을 2점 감소한다. ";
			book_spell = "길이 되는가, 흉이 되는가. 보이지 않는 것, 그 전부가 이 손 안에 있노라.";
			break;
		case "마력붕괴":
			book_use = true;
			book_cate = "엽귀";
			book_type = "주문";
			book_spec = "충격";
			book_cost = "힘 1";
			book_target = "캐릭터 1명";
			book_effect = "누군가가 「마력 리셋」을 했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표가 「마력 리셋」을 할 때, 주사위를 2개 더 굴려서 그중 가장 낮은 눈을 채용한다.";
			book_spell = "폭발하라, 보옥과 분간할 수 없는 화약의 씨앗이여!";
			break;
		case "그림자심방":
			book_use = true;
			book_cate = "엽귀";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "어둠 2";
			book_target = "없음";
			book_effect = "1회 제한: 세션\n조사 판정에 성공했을 때 사용할 수 있다. 그림자 정령으로 「(조사 판정에 사용한 특기명)의 악몽」을 획득한다. 자신이 장면에 등장할 때, 파괴되거나 소멸되지 않았다면 그림자 정령도 같은 타이밍에 소환된다. 〈우자〉는 그림자 정령을 인식할 수 없다.";
			book_spell = "무대의 막이여, 올라가라. 정해진 시각에는 도달하지 못했더라도, 배우들의 그림자여. 무대에 나타나라.";
			break;
		case "복수":
			book_use = true;
			book_cate = "엽귀";
			book_type = "주문";
			book_spec = "죽음";
			book_cost = "어둠 3";
			book_target = "캐릭터 1명";
			book_effect = "자신이 대미지를 입어 【마력】이 감소했을 때 사용할 수 있다. 지정특기 판정에 성공하면 자신이 감소한 【마력】 수치만큼의 대미지를 목표에게 입힌다.";
			book_spell = "춤춰라, 해골이여. 새로운 동료를 선물해줄 것이니.";
			break;
		case "채취":
			book_use = true;
			book_cate = "아방궁";
			book_type = "주문";
			book_spec = "살";
			book_cost = "짐승 2";
			book_target = "〈단장〉이나 〈금서〉 1개체";
			book_effect = "자신이 목표에게 대미지를 입혔을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표가 습득한 특기 1종류를 선택한다. 그 세션 동안 그 특기를 자신이 습득한다. 이 효과로 자신이 특기를 2종류 이상 습득할 수는 없다.";
			book_spell = "순바닥에서 빛을 발하니, 유리병이야말로 그대에게 어울리는 거처.";
			break;
		case "무지개활":
			book_use = true;
			book_cate = "아방궁";
			book_type = "주문";
			book_spec = "빛";
			book_cost = "힘 1";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 자신의 【일시적 마력】을 1점 소비하고 지정특기 판정을 한다. 지정특기 판정에 성공하면 목표에게 3점의 대미지를 입힌다.";
			book_spell = "찬란하게 빛나는 입맞춤은 무지개 다리(비프로스트)로 인도하는 이정표.";
			break;
		case "주문개조":
			book_use = true;
			book_cate = "아방궁";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 세션을 개시할 때/자신이 습득 가능한 마법 1종류 그 세션 동안 선택한 마법을 습득해서 사용할 수 있다. 또, 그 마법의 코스트 종류를 「전」으로 변경할 수 있다. 변경하면 코스트 수치가 1점 상승한다(코스트 X라면 실제로 소비한 마소의 수에서 1점 뺀 수치를 소비한 것으로 간주한다. 코스트가 「없음」이라면 코스트를 전 1로 변경한다).";
			book_spell = "빵보다 달콤한, 구운 과자는 어떠신가? 나무딸기 잼의 향기와 함께.";
			break;
		case "숙명의불길":
			book_use = true;
			book_cate = "문호";
			book_type = "주문";
			book_spec = "마음";
			book_cost = "노래 3";
			book_target = "단일";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 아직 운명의 힘을 사용하지 않은 자신의 앵커를 1명 선택하고, 그 앵커의 체크칸(□)에 체크한다. 지정특기 판정에 성공하면 목표에게 선택한 앵커의 【운명】 수치만큼 대미지를 입힌다. 이 효과를 사용해도 그 앵커의 「소원」을 이루어줄 필요는 없다. 또, 그 세션 동안에는 해당 앵커의 소원을 들어줌으로써 운명의 힘을 사용할 수 없게 된다.";
			book_spell = "인과의 실이 도달하는 종착점. 화염이 되어 타올라라, 맺어진 인연이여.";
			break;
		case "협정":
			book_use = true;
			book_cate = "문호";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "선택 : 세션을 개시할 때/종족 마법 1종류(자작 이상의 마법은 제외) 그 세션 동안 선택한 마법을 습득해 사용할 수 있다.";
			book_spell = "술잔을 나누며 청하노니, 이웃이여. 약정에 따르라.";
			break;
		case "보험":
			book_use = true;
			book_cate = "문호";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 1";
			book_target = "자신";
			book_effect = "1회 제한: 세션\n자신이 사망했을 때, 공적점을 5점 소비하면 앵커의 도움을 빌리지 않아도 「부활」할 수 있다.";
			book_spell = "열쇠와 쇠사슬과 갑옷과 계약, 모두 나의 몸을 지키는 것.";
			break;
		case "별에비는소원":
			book_use = true;
			book_cate = "유실";
			book_type = "주문";
			book_spec = "대지";
			book_cost = "캐릭터 1명";
			book_target = "별 6";
			book_effect = "1회 제한: 세션\n목표가 주사위를 굴린 직후에 사용할 수 있다. 굴린 주사위 중 1개의 주사위 눈을 원하는 수치로 변경한다(변경하는 주사위 눈은 1~6 사이의 상수여야 한다).";
			book_spell = "머리 위에 머무는 별빛이여. 단 한 순간의 빛을 보여다오.";
			break;
		case "용참":
			book_use = true;
			book_cate = "유실";
			book_type = "주문";
			book_spec = "이빨";
			book_cost = "단일";
			book_target = "짐승 5";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 1D6+1점의 대미지를 입힌다.";
			book_spell = "이 참격 앞에서는 금강의 비늘도 종잇장이나 다름 없으니.";
			break;
		case "창뢰":
			book_use = true;
			book_cate = "유실";
			book_type = "주문";
			book_spec = "우레";
			book_cost = "그 마법전에 참가한 자신 이외의 캐릭터와 원형 전부";
			book_target = "힘 6";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 3점의 대미지를 입는다. 또, 그 마법전이 끝날 때까지 목표는 각 라운드를 개시할 때 이 주문에 대한 저항판정을 해야 한다. 실패한 이는 2점의 대미지를 입는다. 이 마법에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 이만이 대미지를 무효로 할 수 있다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "뇌운을 휘감고 하늘에서 춤춰라. 천둥의 칼날에 그 몸을 바쳐라.";
			break;
		case "쾌유":
			book_use = true;
			book_cate = "유실";
			book_type = "주문";
			book_spec = "치유";
			book_cost = "캐릭터 1명";
			book_target = "노래 6";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 걸린 모든 상태이상을 회복하고, 【마력】을 2D6점 회복한다.";
			book_spell = "돌아가라, 돌아가라, 되돌려라, 되돌려라, 자라나라, 자라나라.";
			break;
		case "석일":
			book_use = true;
			book_cate = "유실";
			book_type = "주문";
			book_spec = "추억";
			book_cost = "<단장> 1개체 또는 <서적경> 1명";
			book_target = "꿈 4";
			book_effect = "마법전에서 자기 차레에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 그 마법전 동안 「무한한 마소」 규칙의 적용 대상에서 벗어나며, 마법을 사용할 때 그 마소가 필요하게 된다.";
			book_spell = "망각의 저편에서 되살아나라, 아름다운 봄의 정원.";
			break;
		case "폭령":
			book_use = true;
			book_cate = "유실";
			book_type = "주문";
			book_spec = "심연";
			book_cost = "단일";
			book_target = "어둠 5";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면, 목표는 【일시적 마력】이 있을 경우 그것을 모두 잃으며, 3점의 대미지를 입는다. 또, 이 주문에 대한 저항판정은 《심연》과 《불》로 두 번 해야 한다. 양쪽 모두에 성공해야만 무효로 할 수 있다.";
			book_spell = "축복하라, 백색과 청색의 화염.";
			break;
		case "바다감옥":
			book_use = true;
			book_cate = "유실";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "별 5";
			book_target = "없음";
			book_effect = "이 캐릭터가 대효로 맡은 마법전에서 자신 이외의 캐릭터 전원은 라운드를 개시할 때 《바다》로 판정해야 한다. 실패한 캐릭터는 그 라운드에 플롯할 수 있는 공격, 방어 주사위의 수가 1개씩 감소한다(1개 미만이 되지는 않는다). 판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "대해에 가라앉아라. 우리는 모두 그 자의 포로로다.";
			break;
		case "고양이귀":
			book_use = true;
			book_cate = "유실";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "짐승 4";
			book_target = "없음";
			book_effect = "3회 제한: 세션 자신이 판정을 할 때, 어미에 「야옹」을 붙여서 대사를 하면 해당 판정에 +3의 수정을 적용한다.";
			book_spell = "야옹 야옹 야옹 야옹, 냥냥냥.";
			break;
		case "강인":
			book_use = true;
			book_cate = "유실";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "힘 4";
			book_target = "없음";
			book_effect = "3회 제한: 세션 자신의 공격 스텝에 공격을 하는 대신 「혼의 특기」 이외의 특기를 아무거나 골라 판정할 수 있다. 이 판정에 성공하면 적 대표는 같은 특기로 판정을 해야 한다. 이 판정에 실패할 경우, 적 대표에게 2점의 대미지를 입힌다. 이 마법의 사용자가 판정을 했다면 방어측도 플롯을 하지 않는다.";
			book_spell = "때려 부숴라, 나의 주먹.";
			break;
		case "성궤":
			book_use = true;
			book_cate = "유실";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "노래 5";
			book_target = "없음";
			book_effect = "1회 제한: 세션\n자신이 마법전 도중에 사망했을 때, 그 직후에 「부활」을 시도할 수 있다. 부활이 성공하면 그 마법전에 계속해서 참가할 수 있다. 자신이 대표였다면 패배하지 않는다.";
			book_spell = "죽음은 한순간의 몽환, 나의 잠자리는 여기에 없노라.";
			break;
		case "날개옷":
			book_use = true;
			book_cate = "유실";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "꿈 4";
			book_target = "없음";
			book_effect = "마법전 동안 방어 주사위를 공개했을 때, 공개한 주사위 중 아무거나 2개를 골라 제거하고, 제거한 주사위의 눈의 합계와 같은 눈의 방어 주사위 1개를 늘릴 수 있다(「계약」이나 【부스트】처럼 방어 주서위를 추가하는 효과를 사용한 후에는 사용할 수 없다. 또, 집중방어를 했을 때는 효과가 없다).";
			book_spell = "다함께 춤춰라, 하늘에서 내려온 처녀의 옷.";
			break;
		case "탐욕":
			book_use = true;
			book_cate = "유실";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "어둠 4";
			book_target = "없음";
			book_effect = "1회 제한: 세션\n「단장」을 프라이즈로 획득했을 때, 「마법 박탈」과 「마력 박탈」의 효과를 양쪽 모두 선택할 수 있다.";
			book_spell = "나의 굶주림은 조금도, 조금도, 조금도 나아지지 않으니!";
			break;
		case "쌍령소환":
			book_use = true;
			book_cate = "금서";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "자신의 영역에서 무작위로 특기 2개를 선택한다. 그 2개의 특기가 지정특기가 된다(같은 종류의 특기가 선택되면 이 마법은 자동으로 실패한다). 임의의 순서로 지정특기 판정을 한다. 양쪽 모두의 판정에 성공하면 「(처음으로 판정한 특기명)의 정령」과 「(두 번째로 판정한 특기명)의 정령」을 1개체씩 소환할 수 있다.";
			book_spell = "거울에 비친 모습은 자신의 사악한 모습이나니.";
			break;
		case "악귀소환":
			book_use = true;
			book_cate = "금서";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "자신의 영역에서 무작위로 특기 1개를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 정령」을 1개체 소환할 수 있다. 이 정령은 【추가 대미지1】을 가진다.";
			book_spell = "가련하도다, 정령이여. 그대에게 주어진 새로운 생명, 그 앞에서 기다리는 것은 죽음의 음색과 Null.";
			break;
		case "원령소환":
			book_use = true;
			book_cate = "금서";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "그 장면에 등장한 캐릭터 중에서 상흔을 하나 선택한다. 그 상흔에 대응하는 마소와 같은 영역에서 무작위로 특기 1개를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 마신」을 1개체 소환할 수 있다. 같은 마법전 동안 이 마법으로 같은 상흔을 2회 이상 선택할 수는 없다.";
			book_spell = "자, 노래하라! 그 몸을 불사르는 저주의 노래를! 꿀보다 달콤한 저주의 말!";
			break;
		case "오염":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "적 입회인 1명";
			book_effect = "선택: 습득했을 때/상태이상 1종류 마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 선택한 상태이상을 건다.";
			book_spell = "담수에 부정의 정수를 한 방울, 두 방울 떨어뜨려라. 괜찮아, 누구도 눈치 채지 못할 테니.";
			break;
		case "책꽂이":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "적 대표가 공격 주사위를 공개했을 때, 그 주사위 눈이 모두 같다면 사용할 수 있다(「계약」이나 【부스트】처럼 공격 주사위를 추가하는 효과를 사용한 후에는 사용 할 수 없다). 그 공격 주사위의 수만큼 방어 주사위를 추가로 굴릴 수 있다.";
			book_spell = "착한 아이는 모두 여기에 모이렴. 책장 안에서는 얌전히.";
			break;
		case "가책":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "상흔을 가진 캐릭터 1명";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표가 가진 상흔의 수에 1D6을 더한 만큼 대미지를 입힌다.";
			book_spell = "쥐어 뜯어라! 피부가 찢어지고, 피가 튀고, 뼈가 드러날 때까지!";
			break;
		case "공복":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표의 【마력】 최대치에서 【마력】 현재치를 뺀 수치를 산출한다. 목표는 그 수치만큼 충전한 마소를 잃는다. 그 후, 목표는 【마력】을 1점 회복한다.";
			book_spell = "돌아보라! 자기 자신보다 맛있는 것은 없을지니. 마음껏 먹으라, 끝이 찾아 올 때까지.";
			break;
		case "영체포식":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "자신이 사역하는 원형 1개체";
			book_effect = "마법전에서 자기 차례에 사용할 수 있다. 목표의 상징과 같은 특기를 지정특기 삼아 판정한다. 지정특기 판정에 성공하면 목표를 파괴한다. 그리고 목표의 원형 레벨만큼 자신의 【마력】을 회복하고, 그 마법전 동안 【추가 대미지1】이 발생한다.";
			book_spell = "입이 왜 이렇게 크냐고? 그야 너를 잡아먹기 위해서지!";
			break;
		case "패권":
			book_use = true;
			book_cate = "금서";
			book_type = "주문";
			book_spec = "";
			book_cost = "없음";
			book_target = "적 대표";
			book_effect = "마법전 동안 자신의 공격 스텝에 자신이 공격을 하는 대신 사용할 수 있다. 지정특기 판정에 성공하면 목표로 하여금 패배를 선언하게 한다. 단, 목표의 【마력】과 【일시적 마력】의 합계치가 4 이상이라면 이 마법의 효과는 발휘되지 않는다.";
			book_spell = "나의 앞에 무릎을 꿇어라! 그저 목숨만을 구걸할지어다! 나야말로 패왕이로다!";
			break;
		case "폭탄상자":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 마법을 습득한 〈단장〉을 조사하는 데 성공한 캐릭터는 《불》로 판정해야 한다. 이 판정은 저항판정으로 간주한다. 실패한 캐릭터는 3점의 대미지를 입는다.";
			book_spell = "술래야, 이쪽으로 오렴. 손뼉 치는 쪽으로. 나의 그림자를 밟아 보려무나.";
			break;
		case "암습":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "1회 제한: 세션\n메인 페이즈의 드라마 장면에서 【마력】이 3점 이하가 된 PC가 있다면, 그 PC에게 마법전을 신청할 수 있다. 이 마법을 습득한 이의 숙주가 판명되지 않은 상태에서 이 마법의 효과를 사용하면, 그 숙주가 장면에 등장하여 그것이 누구인지 밝혀진다(【비밀】이 공개되는 것은 아니다). 어떤 효과로 인해 마법의 사용자가 장면에 등장할 수 없다면 이 효과는 발휘되지 않는다.";
			book_spell = "강자는 칭찬하고, 약자는 마구 때린다.";
			break;
		case "금구":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득했을 때/네 글자 이상으로 된, 의미를 가지는 말 세션 동안 플레이어가 선택한 단어를 말했을 때, 그 플레이어의 PC에게 1점의 대미지를 입힐 수 있다. 이 마법을 습득한 이의 숙주가 판명되지 않은 상태에서 이 마법의 효과를 사용했다면, 그 숙주가 장면에 등장하여 그것이 누구인지 밝혀진다(【비밀】이 공개되는 것은 아니다). 어떤 효과로 인해 마법의 사용자가 장면에 등장할 수 없다면 이 효과는 발휘되지 않는다.";
			book_spell = "그것과 마주하면 몸이 더러워지고, 그 이름을 부르면 혼이 오탁으로 물드니.";
			break;
		case "소환영격":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터가 등장한 장면에서 소환 타입 마법을 사용한 캐릭터는 1점의 대미지를 입는다.";
			book_spell = "젖먹이야, 가시를 세워라. 그 가시로 너를 낳은 자를 찔러라!";
			break;
		case "주문영격":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터가 등장한 장면에서 주문 타입 마법을 사용한 캐릭터는 1점의 대미지를 입는다.";
			book_spell = "내 앞에서 말하지 말지어다. 내 앞에서 웃지 말지어다. 내 앞에서 노래하지 말지어다.";
			break;
		case "분쟁":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터가 등장한 장면에서 「운명의 힘」을 사용한 캐릭터는 대응하는 앵커의 【운명】 수치만큼 대미지를 입는다.";
			book_spell = "누구에게도 말 못할 속내는 감춘 채 나이프를 갈아 날을 세워라. 찢어발길 그 때를 기다려라.";
			break;
		case "난장":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득했을 때/1~6까지의 숫자 중 1종류 이 캐릭터는 마법전에서 공격을 할 때, 선택한 숫자를 플롯할 수 없다. 주사위를 무작위로 플롯하거나, 【부스트】처럼 공격 주사위를 추가하는 효과로 인해 그 숫자가 나오면 해당하는 주사위를 제거한다. 이 마법의 소유자는 【추가 대미지2】를 가진다.";
			book_spell = "일, 이, 삼, Sa, 육, 칠, 십. 뭐가 빠졌는지 모르겠어, 모르겠어.";
			break;
		case "위서":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득했을 때/영역 이 캐릭터가 대표를 맡은 마법전에서 이 캐릭터 이외의 나머지는 선택한 영역의 마소가 코스트에 포함된 마법을 사용할 수 없다.";
			book_spell = "황금, 은, 유리와 수정. 넘쳐나는 보물은 모두 가짜.";
			break;
		case "발행금지":
			book_use = true;
			book_cate = "금서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "선택: 습득했을 때/마법 1종류 이 마법을 습득한 〈단장〉이 빙의한 숙주의 【비밀】이 공개되면, 이후 그 세션 동안 아무도 선택된 마법을 사용할 수 없다. 이 효과는 이 마법을 습득한 〈단장〉을 회수하면 무효가 된다.";
			book_spell = "닫힌 상자 안에서 춤추거라, 무희여.";
			break;
		case "미끼":
			book_use = true;
			book_cate = "서적경";
			book_type = "주문";
			book_spec = "악의";
			book_cost = "없음";
			book_target = "〈우자〉 1명";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 그 세션 동안 마법사가 목표와의 【운명】을 1점 상승시킬 때마다 해당 마법사가 상태이상 한 가지에 걸린다.";
			book_spell = "과실에 파고든 독충, 왜소하지만 사랑스러운 것.";
			break;
		case "전가":
			book_use = true;
			book_cate = "서적경";
			book_type = "주문";
			book_spec = "광기";
			book_cost = "없음";
			book_target = "마법사 1명";
			book_effect = "「꿈」 영역의 〈단장〉을 가지고 있다면 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 자신의 의무 하나가 목표에게 넘어간다.";
			book_spell = "당신에게 줄게, 모든 것을 줄게, 병도 고통도 전부.";
			break;
		case "날조":
			book_use = true;
			book_cate = "서적경";
			book_type = "장비";
			book_spec = "거짓";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "「꿈」 영역의 〈단장〉을 가지고 있다면 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 목표에 대한 자신의 【운명】을 1점 상승시킨다.";
			book_spell = "그대는 잊었는가, 신록이 움트는 아름다운 나날을.";
			break;
		case "행복":
			book_use = true;
			book_cate = "이상향";
			book_type = "주문";
			book_spec = "기도";
			book_cost = "없음";
			book_target = "〈우자〉 1명";
			book_effect = "「노래」 영역의 〈단장〉을 가지고 있다면 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 자신의 〈우자〉 앵커가 받고 있는 불행 한 가지를 목표에게 넘긴다.";
			book_spell = "헌신에 감사를. 제물에 연민을.";
			break;
		case "구가":
			book_use = true;
			book_cate = "이상향";
			book_type = "주문";
			book_spec = "승리";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 대미지를 입었을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표의 【마력】을 2점 회복한다.";
			book_spell = "노래하자, 이 기쁨을. 노래하자, 이 생명을.";
			break;
		case "생존":
			book_use = true;
			book_cate = "이상향";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "누적 불가\n【진정한 모습】의 효과인 【방어 강화】를 사용하면, 그 마법전 동안 목표의 방어 스텝에 방어 주사위를 플롯할 때 추가로 주사위 2개를 더 플롯할 수 있다(집중방어 때는 효과가 없다).";
			book_spell = "죽음이라는 이름의 악을 쫓아내라. 삶이야말로 올바른 모습.";
			break;
		case "불쏘시개":
			book_use = true;
			book_cate = "분서관";
			book_type = "주문";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "지정특기가 《불》인 주문이나 이름에 불을 의미하는 글자가 포함된 주문 타입 마법을 사용할 때 사용할 수 있다. 자신의 【마력】을 1점 소비하면 그 주문으로 입힐 수 있는 대미지가 2점 상승한다. 대미지를 입히지 않는 주문에 대해서는 효과가 없다.";
			book_spell = "재 속의 숯불이여, 떠올려라. 너야말로 불길이로다.";
			break;
		case "연서":
			book_use = true;
			book_cate = "분서관";
			book_type = "주문";
			book_spec = "불";
			book_cost = "없음";
			book_target = "캐릭터 1명";
			book_effect = "지정특기 판정에 성공하면 목표는 「불운」 상태이상에 걸린다. 또, 모표가 습득한 마법을 무작위로 하나 선택한다. 목표는 「불운」 상태이상에 걸려있는 동안 그 마법을 사용할 수 없다.";
			book_spell = "최상의 제물로 타오르는 홍련의 화염이여, 하늘조차 태우거라.";
			break;
		case "성냥":
			book_use = true;
			book_cate = "분서관";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 《불》 특기를 사용해서 판정할 때, 그 판정에 +2의 수정을 적용한다.";
			book_spell = "업화는 작은 등불에서 생겨난다.";
			break;
		case "향연":
			book_use = true;
			book_cate = "구세계질서";
			book_type = "주문";
			book_spec = "에로스";
			book_cost = "없음";
			book_target = "자신 이외의 캐릭터를 원하는 만큼";
			book_effect = "드라마 장면에 사용할 수 있다. 지정특기 판정에 성공하면 목표는 【마력】을 2점 회복하고, 원하는 마소를 1개 획득한다. 그 후, 목표가 회복한 【마력】의 합계치만큼 자신의 【마력】을 회복한다.";
			book_spell = "건배! 이제부터 미치광이의 연회를 시작해보자!";
			break;
		case "칼날방어":
			book_use = true;
			book_cate = "구세계질서";
			book_type = "주문";
			book_spec = "대지";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "누적 불가\n마법전에서 자기 차례에 사용할 수 있다. 지정특기 판정에 성공하면 적의 공격이 성공했을 때, 적이 사역하는 「마검」이나 「기사」의 【추가 대미지】 수치를 1점 감소한다.";
			book_spell = "칼이여, 너는 납의 덩어리요. 칼이여, 너는 무딘 쇠붙이에 불과하도다.";
			break;
		case "미궁":
			book_use = true;
			book_cate = "구세계질서";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신에게 마법전을 신청한 자와 그의 입회인은 「떠돌이 괴물 표」(기본 p216)를 1회 사용해야 한다. 또, 자신은 라운드를 개시할 때 「마법전에서 자기 차례」에 사용할 수 있는 주문을 자신을 목표로 한 번 사용할 수 있다. 이 주문 사용은 라운드마다 사용할 수 있는 주문 횟수의 제한에 포함되지 않는다.";
			book_spell = "다이달로스의 인도여, 나의 정원에 안식을.";
			break;
		case "마수소환":
			book_use = true;
			book_cate = "어둠의 심장";
			book_type = "소환";
			book_spec = "어둠";
			book_cost = "없음";
			book_target = "없음";
			book_effect = "「어둠」 영역의 〈단장〉을 가지고 있다면 사용할 수 있다. 「어둠」 영역에서 2D6을 굴려 무작위로 특기 1개를 선택한다. 그것이 지정특기가 된다. 지정특기 판정에 성공하면 「(특기명)의 기사」를 소환한다. 이 기사는 【스펠 가드2】를 습득하고 있다.";
			book_spell = "미쳐 날뛰어라! 살을 뜯고 뼈를 물어 부숴라!";
			break;
		case "여자":
			book_use = true;
			book_cate = "어둠의 심장";
			book_type = "주문";
			book_spec = "환각";
			book_cost = "없음";
			book_target = "마법사 1명";
			book_effect = "드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 운명 변전이 발생한다.";
			book_spell = "그대는 외로운 여자아이. 외톨이 여자아이.";
			break;
		case "대지방":
			book_use = true;
			book_cate = "어둠의 심장";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "이 캐릭터가 대표를 맡은 마법전에서는 자신의 【일시적 마력】이 1점 이상일 경우, 자신의 방어 스텝에 방어 주사위를 플롯할 때 추가로 주사위 2개를 더 플롯할 수 있다(집중방어를 할 때는 효과가 없다).";
			book_spell = "크고 하얗고 부드럽다. 나의 육체는 아름답구나.";
			break;
		case "호물소환":
			book_use = true;
			book_cate = "혼혈주의자";
			book_type = "소환";
			book_spec = "";
			book_cost = "없음";
			book_target = "적 대표와 그 입회인 전원";
			book_effect = "선택: 사용할때/《비늘》이나 《충격》, 또는 《죽음》 중에서 특기 1종류, 1회 제한: 마법전 선택한 특기가 지정특기다. 지정특기 판정에 성공하면 「(지정특기)의 군단」을 1개체 소환할 수 있다. 그 원형이 있는 동안, 라운드를 종료할 때마다 목표는 지정특기와 같은 특기로 판정해야 한다. 실패한 캐릭터는 1점의 대미지를 입는다.";
			book_spell = "자, 놀아보자! 내가 꿈꾸는 괴물들이여!";
			break;
		case "소란":
			book_use = true;
			book_cate = "혼혈주의자";
			book_type = "주문";
			book_spec = "혼돈";
			book_cost = "없음";
			book_target = "그 장면에 등장한 캐릭터와 원형 전원";
			book_effect = "1회 제한: 장면\n그 장면 동안 판정이 2회 이상 연속으로 실패했을 때 사용할 수 있다. 지정특기 판정에 성공하면 목표에게 2점 이상의 대미지를 입힌다. 이 주문에 대한 저항판정은 목표마다 개별적으로 하며, 성공한 이만이 대미지를 무효로 할 수 있다. 저항판정을 하는 순서는 이 마법의 사용자가 결정한다.";
			book_spell = "울어라, 외쳐라, 부숴라! 법도 질서도, 개나 줘버려!";
			break;
		case "특등석":
			book_use = true;
			book_cate = "혼혈주의자";
			book_type = "장비";
			book_spec = "없음";
			book_cost = "없음";
			book_target = "자신";
			book_effect = "자신이 마법전에서 입회인이 되었을 때, 효과의 첫 줄에 「입회인」이라고 적혀 있지 않은 주문 타입 마법을 사용할 수 있다. 이때, 사용 타이밍은 각 주문의 타이밍을 따른다(자신의 차례나 자신의 공격, 소환 스텝에 사용할 수 있는 주문은 사용할 수 없다).";
			book_spell = "이곳은 내가 앉을 장소. 이제 곧 개연 시간이라네.";
			break;
		}

	}
}
