package ins;

public class B {
	public static void main(String[] args) {
		
	
		String[] abillity_data = new String[172];
		abillity_data[0] = "기본&&기본공격&&공격&&&&아무거나&&&&목표 1명을 선택해서 명중판정을 한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 1D6점 대미지.&&";
		abillity_data[1] = "기본&&전장이동&&서포트&&&&없음&&&&지원행동. 이 어빌리티를 사용하면 전투에 참가한 캐릭터 전원은 다음 라운드가 시작할 때 플롯을 한다.&&";
		abillity_data[2] = "범용&&트릭&&공격&&&&기술분야에서 아무거나&&&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 목표에게 2점의 대미지를 입힌다. 이때 목표는 회피판정에 -2의 수정을 적용한다.&&기책을 사용하여 상대를 상처입힌다.";
		abillity_data[3] = "범용&&강타&&공격&&&&폭력 분야에서 아무거나&&&&목표 1명을 선택하여 명중판정을 한다. 이때 자신의 속도 수치만큼 명중판정에 마이너스 수정을 적용한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 목표에게 「1D6+자신의 속도」점의 대미지를 입힌다.&&기세를 몰아 공격한다.";
		abillity_data[4] = "범용&&저격&&공격&&사격&&기술 분야에서 아무거나, 사격&&&&몹 1개체를 목표로 선택하여 명중판정을 한다. 명중판정이 성공하면 목표에게 2D6점의 대미지를 입힌다.&&특정한 적을 저격한다.";
		abillity_data[5] = "범용&&난동&&공격&&병기&&폭력 분야에서 아무거나, 병기&&&&당신이 공개한 【광기】의 수만큼 목표를 선택하여 명중판정을 한다 (에너미의 경우는 1D6명까지 선택한다). 명중판정이 성공하면 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 1D6-2점의 대미지를 입힌다. (대미지는 최저 0점).&&단숨에 여러 명의 적을 공격하는 방법";
		abillity_data[6] = "범용&&봉인&&공격&&6.괴이&&괴이 분야 가변&&&&원하는 만큼 목표를 선택한다. 괴이 분야에서 무작위로 지정특기를 하나 선택하여 명중판정을 한다. 명중판정에 성공하면 이 어빌리티를 사용한 자의 【이성치】가 1점 감소한다. 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표는 그 라운드 동안 공격과 회피판정을 할 수 없다.&&괴이의 행동을 일시적으로 봉인한다.";
		abillity_data[7] = "범용&&소환&&공격&&6.괴이&&괴이 분야 가변&&&&목표를 1명 선택한다. 괴이 분야에서 무작위로 지정특기를 하나 선택하여 명중판정을 한다. 명중판정에 성공하면 이 어빌리티를 사용한 자의 【이성치】가 1점 감소한다. 목표는 -3의 수정을 적용하여 회피판정을 한다. 목표가 회피판정에 실패하면 목표에게 2d6점의 대미지를 입힌다.&&괴이를 불러내서 무수한 생명을 빼앗는다.";
		abillity_data[8] = "범용&&착각&&서포트&&&&정서 분야에서 아무거나&&&&당신이 【광기】를 획득했을 때 사용할 수 있다. 지정특기 판정에 성공하면 당신이 가지고 있는 【광기】를 원하는 만큼 선택하여 덱에 되돌리고, 다시 섞는다. 그리고 되돌린 【광기】와 같은 수만큼 새로운 【광기】를 얻는다.&&자신의 진정한 마음을 깨닫는다.";
		abillity_data[9] = "범용&&연격&&서포트&&&&폭력 분야에서 아무거나&&&&당신이 공격했을 때, 공격 목표가 회피 판정에 성공했다면 사용할 수 있다. 공격 목표는 이 어빌리티의 지정특기로 한 번 더 회피판정을 해야 한다 (자신의 플롯치와 관계없이 이 어빌리티의 지정특기로 판정한다). 이 회피판정에 실패하면 공격이 명중한다.&&두 개의 무기로 연이어 공격한다.";
		abillity_data[10] = "범용&&정신분석&&서포트&&의학&&정서 분야에서 아무거나, 의학&&&&당신이 조사판정이나 감정판정에 성공했을 때 사용할 수 있다. 조사판정이나 감정판정의 목표 1명을 이 어빌리티의 목표로 선택한다. 지정특기 판정에 성공하면 목표의 【정신상태】를 원하는 만큼 획득할 수 있다.&&심층심리나 무의식의 영역을 해석한다.";
		abillity_data[11] = "범용&&유혹&&서포트&&&&정서 분야에서 아무거나&&&&감정판정에 성공했을 때 사용할 수 있다. 감정판정의 목표는 이 어빌리티의 지정특기로 판정을 해야 한다. 해당 판정이 실패한 경우, 이 어빌리티의 사용자는 자신에 대해 감정판정의 목표가 획득하는 【감정】의 종류나 속성을 마음대로 결정하며, 또한 목표의 【거처】나 목표가 가진 아이템 1개를 획득(강탈)할 수 있다.&&상대의 마음을 농락하여 원하는 대로 한다.";
		abillity_data[12] = "범용&&위험감지&&서포트&&&&지각 분야에서 아무거나&&&&전투 중 당신이 버팅에 말려들었을 때 사용할 수 있다. 지정특기 판정에 성공하면 버팅으로 인한 대미지를 무효로 할 수 있다.&&순간적으로 위험을 감지하여 피한다.";
		abillity_data[13] = "범용&&짐작&&서포트&&&&지각 분야에서 아무거나&&&&누군가가 【정보】를 획득했을 때 사용할 수 있다. 지정특기 판정에 성공하면 그 캐릭터가 획득한 【정보】를 당신도 획득할 수 있다. (이 효과는 당신이 장면에 등장하지 않았더라도 사용할 수 있다.)&&정보를 입수할 곳을 짐작한다.";
		abillity_data[14] = "범용&&전격작전&&서포트&&&&기술 분야에서 아무거나&&&&당신이 누군가의 【거처】를 획득했을 때 사용할 수 있다. 지정특기 판정에 성공하면 그 【거처】의 소유주에게 전투를 걸 수 있다.&&상대의 거주지를 찾아내어 곧바로 공격한다.";
		abillity_data[15] = "범용&&감싸기&&서포트&&친애&&지각 분야에서 아무거나, 친애&&&&당신이 플러스 【감정】을 가진 캐릭터가 대미지를 입었을 때 사용할 수 있다. 지정특기 판정에 성공하면 그 대미지를 1D6점 줄이고, 당신이 대신 받을 수 있다. 단, 이 효과로 대미지를 0 이하로 만들 수는 없다.&&동료의 위험을 알아차리고 감싼다.";
		abillity_data[16] = "범용&&개발&&서포트&&마술&&지식 분야에서 아무거나, 마술&&&&당신이 장면 플레이어인 드라마 장면에서 사용할 수 있다. 【이성치】나 【생명력】 1점을 소비하고 지정특기 판정에 성공하면 아이템을 하나 획득할 수 있다.&&먹지도 자지도 않고 획기적인 발명에 힘쓴다.";
		abillity_data[17] = "범용&&보복&&서포트&&&&지식 분야에서 아무거나&&&&당신이 대미지를 입었을 때 사용할 수 있다. 당신에게 대미지를 입힌 캐릭터 중 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표에게 1점의 대미지를 입힌다. 목표는 이 어빌리티의 지정특기로 판정을 할 수 있다. 그 판정에 성공하면 이 어빌리티의 효과를 무효로 할 수 있다.&&상대가 펼친 공격의 기세를 이용하여 보복한다.";
		abillity_data[18] = "범용&&탄원&&서포트&&6.괴이&&괴이 분야 가변&&&&메인 페이즈에서 장면과 장면의 사이에 사용할 수 있다. 괴이 분야에서 무작위로 자정특기를 하나 선택하여 판정한다. 판정에 성공하면 이 어빌리티를 사용한 자의 【이성치】가 1점 감소하고, 그 드라마 장면에서 시도하는 판정에는 +1의 수정을 적용한다. 이 효과는 한 세션에 1회만 사용할 수 있다.&&자신의 소원을 이루기 위해서 괴이의 힘을 빌린다. 금단의 마법이다.";
		abillity_data[19] = "범용&&연구&&서포트&&&&지식 분야에서 아무거나&&&&당신이 장면 플레이어인 드라마 장면에서 사용할 수 있다. 당신이 【비밀】을 획득한 캐릭터 1명을 목표로 선택하여 지정특기 판정을 한다. 성공하면 목표의 【거처】를 획득한다. 또한, 그 후 전투 중에 목표가 당신과 같은 속도에 있다면 목표는 회피판정을 할 수 없다.&&상대를 연구하여 대처법을 공략한다.";
		abillity_data[20] = "범용&&대담함&&장비&&&&없음&&&&【이성치】 최대치가 1점 증가한다. 이 어빌리티는 다중습득이 가능하다.&&공포를 모르며, 배짱이 좋다.";
		abillity_data[21] = "범용&&강건함&&장비&&&&없음&&&&【생명력】 최대치가 2점 증가한다. 이 어빌리티는 다중 습득이 가능하다.&&매우 튼튼한 몸의 소유자";
		abillity_data[22] = "범용&&자산&&장비&&&&없음&&&&아이템을 2개 더 가진다.&&비교적 자유롭게 사용할 수 있는 자산이 있다.";
		abillity_data[23] = "범용&&요령&&장비&&&&없음&&&&특기를 하나 더 획득할 수 있다. 이 어빌리티는 2개까지 습득이 가능하다.&&요령이 좋고, 다양한 기능에 능하다.";
		abillity_data[24] = "범용&&지위&&장비&&&&없음&&&&당신의 조사판정에 +1의 수정을 적용한다.&&사회적 신분이 높고, 인맥도 많다.";
		abillity_data[25] = "범용&&장갑&&장비&&&&없음&&&&당신이 대미지를 입었을 때 그 대미지를 1점 감소할 수 있다. 단, 이 효과를 대미지를 0 이하로 만들 수는 없다.&&위험에 대해 여러 가지 조치를 취해두었다.";
		abillity_data[26] = "범용&&화염병&&공격&&소각&&&&&&당신보다 속도가 느린 캐릭터 중에서 목표를 1명을 선택해서 명중판정을 한다. 이 명중판정에는 -2의 수정이 적용된다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 1D6점의 대미지를 입힌다. 또, 이 공격으로 1점 이상 대미지를 입은 캐릭터는 그 전투 동안 라운드가 끝날 때마다 1점의 대미지를 입는다(같은 대상에게 여러번 사용해도 라운드가 끝날 때 입는 대미지는 누적되지 않는다.)&&화염병을 사용하여 화상을 입힌다.";
		abillity_data[27] = "범용&&무술&&공격&&파괴&&파괴, 구타, 절단, 찌르기&&&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 1D6점의 대미지를 입힌다. 이때 무기 1개를 소비할 때마다 대미지를 2점씩 증가시킬 수 있다.&&전통적인 전투기술.";
		abillity_data[28] = "범용&&독침&&공격&&약품&&&&&&당신과 같은 속도의 캐릭터 중에서 목표 1명을 선택해서 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면 목표에게 2D6점의 대미지를 입힌다.&&맹독이 묻은 바늘이나 주사기를 꽂는다.";
		abillity_data[29] = "범용&&투석&&공격&&사격&&&&&&목표를 3명까지 선택하여 명중판정을 한다. 명중판정이 성공하면 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 2점의 대미지를 입힌다.&&발밑에 굴러다니는 돌멩이나 잡동사니를 던진다.";
		abillity_data[30] = "범용&&제령&&공격&&6.괴이&&괴이 분야 가변&&&&괴이 에너미 중에서 목표를 1명 선택한다. 괴이 분야에서 무작위로 지정특기를 하나 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면 목표에게 3D6-3점의 대미지를 입힌다.&&괴이를 쫓는 신비한 술법.";
		abillity_data[31] = "범용&&중화기&&공격&&병기&&&&&&전투에 참가한 당신 이외의 캐릭터 전원을 목표로 선택하여 명중판정을 한다. 명중판정이 성공하면 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 1D6+2점의 대미지를 입힌다. 이 효과는 한 전투당 1회만 사용할 수 있다.&&기관총이나 로켓런처 등의 중화기";
		abillity_data[32] = "범용&&불행 중 다행&&서포트&&&&없음&&&&당신이 펌블을 발생시켰을 때나 누군가와 버팅을 했을 때 사용할 수 있다. 원하는 아이템 1개를 획득한다.&&구르거나 부딪힌 곳에서 뭔가를 발견한다.";
		abillity_data[33] = "범용&&헌신&&서포트&&&&없음&&&&당신이 블록을 했을 때나 【감싸기】 어빌리티에 성공했을 때 사용할 수 있다. 그로 인해 입을 대미지를 2점 경감할 수 있다 (0 미만이 되지 않는다). 만약 대미지를 대신 입어줄 상대에 대해 당신이 플러스 【감정】을 가지고 있다면 추가로 2점을 더 경감할 수 있다.&&필사적으로 동료를 지킨다.";
		abillity_data[34] = "범용&&분신사바&&서포트&&&&없음&&&&드라마 장면에서 사용할 수 있다. 당신의 PC는 【이성치】를 1점 소비한다. 당신은 눈을 감고 검지를 캐릭터 시트의 특기 리스트 중 《마술》위에 올린다. GM은 아무거나 특기를 하나 선택해서 선언한다. 당신은 눈을 감은 채로 손가락을 움직인다. 눈을 떴을 때, GM이 지정한 특기 위헤 손가락이 올라가 있다면 원하는 【비밀】을 하나 획득할 수 있다. 그렇지 않다면 당신의 PC는 【이성치】가 1점 감소한다.&&테이블 터닝이나 워조븓, 엔젤님…. 다양한 이름으로 불리는 점.";
		abillity_data[35] = "범용&&신속한 일처리&&서포트&&&&없음&&&&회복판정, 조사판정, 감정판정에서 스페셜이 발생했을 때 사용할 수 있다. 회복판정, 조사판정, 감정판정 중 하나를 한 번 더 할 수 있다.&&재빨리 여러 가지 일을 처리하는 재능";
		abillity_data[36] = "범용&&간격&&서포트&&추적&&&&&&지원행동. 지정특기 판정에 성공하면 당신의 속도를 1점 증가시키거나, 1점 감소시킬 수 있다(속도를 7이상, 0이하로 할 수는 없다).&&전투 중에 서서히 유리한 위치에 선다.";
		abillity_data[37] = "범용&&공감&&서포트&&인내&&&&&&드라마 장면에 사용할 수 있다. 당신이 플러스 【감정】을 가진 캐릭터 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표가 가진 미공기 【광기】중 1장을 무작위로 선택해서 획득한다.&&마음이 통하는 상대가 지닌 마음의 어둠을 대신 부담한다.";
		abillity_data[38] = "범용&&동요시키기&&서포트&&미디어&&&&&&드라마 장면에서 사용할 수 있다. 같은 장면에 등장한 캐릭터 중에서 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표의 【비밀】을 당신이 획득했을 때 당신이 쇼크를 받게 되는지를 GM에게 몰래 들을 수 있다.&&상대의 동요를 유도하여 정보를 끌어낸다.";
		abillity_data[39] = "범용&&속공&&서포트&&효율&&&&&&전투 중에 속도가 같은 캐릭터가 있어서 1D6을 굴려 순서를 정할 때 사용할 수 있다. 지정특기 판정에 성공하면 그 1D6의 수치를 2점 증가시킬 수 있다.&&적의 빈틈을 찾아내어 먼저 행동한다.";
		abillity_data[40] = "범용&&연금술&&서포트&&화학&&&&&&전투가 끝날 때 행동불능이 된 괴이 에너미가 있다면 사용할 수 있다. 지정특기 판정에 성공하면 진통제를 하나 획득할 수 있다.&&괴이의 시체에서 특수한 화합물을 정제한다.";
		abillity_data[41] = "범용&&심령사진&&서포트&&카메라&&&&&&드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공한 경우, 그 장면에 등장한 캐릭터 중에서 속성이 괴이인 에너미나 본인이 괴이임을 나타내는 【비밀】을 가진 캐릭터가 있다면 그 사실을 GM이 가르쳐준다. (해당하는 자가 여럿이라면 누가 해당하는지는 들을 수 없다).&&괴이의 기척을 사진으로 찍는다.";
		abillity_data[42] = "범용&&다우징&&서포트&&지저&&&&&&드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 1D6을 굴린다. 그 눈이 1이라면 진통제, 2~3이라면 무기, 4~5라면 부적을 하나 획득한다. 주사위 눈이 6이라면 그 시나리오에 등장할 괴이 에너미가 등장한다(괴이 에너미가 등장하지 않는 시나리오에서는 아무 일도 일어나지 않는다.) 이때 이 어빌리티의 사용자는 괴이 분야에서 무작위로 특기 하나를 선택하여 공포판정을 한다. 그 공포판정에 성공하면 해당 괴의의 【거처】를 획득한다.&&봉이나 진자로 땅속에 묻힌 것을 찾는다.";
		abillity_data[43] = "범용&&최면술&&서포트&&인류학&&&&&&드라마 장면에서 사용할 수 있다. 같은 장면에 등장한 캐릭터 중에서 1명을 목표로 선택한다. 지정특기 판정에 성공하면 그 장면 동안 목표가 습득한 서포트 어빌리티를 자신이 습득한 것처럼 사용할 수 있다.&&최면상태로 만들어서 자신에게 유리하게 적용한다.";
		abillity_data[44] = "범용&&행운&&장비&&&&없음&&&&회복판정, 조사판정, 감정판정의 스페셜치가 10이 된다.&&매우 운이 좋다.";
		abillity_data[45] = "범용&&신앙심&&장비&&&&없음&&&&당신의 판정 결과가 스페셜이면 부적을 하나 획득한다.&&어떠한 종교나 사상, 취미 등 당한 신앙을 가지고 있다.";
		abillity_data[46] = "범용&&마도서&&장비&&&&없음&&&&지정특기가 괴이 분야인 특기 판정을 세션 중 한번만 주사위를 굴리지 않고 자동으로 성공할 수 있다 (스페셜은 아니다).&&이 세계의 비밀이 적혀있는 비전서.";
		abillity_data[47] = "범용&&영감&&장비&&&&없음&&&&현상 에너미를 공격할 때, GM이 지정한 특기가 아니어도 펌블치가 증가하지 않고 -5의 수정도 적용하지 않는다. 또, 괴이 에너미의 공격에 대해 회피판정을 할 때 +1의 수정을 적용한다.&&보일 리가 없는 것이 보인다.";
		abillity_data[48] = "범용&&인도자&&장비&&&&없음&&&&괴이 에너미와 전투를 할 때 대미지를 1점 경감할 수 있다. 도, 부적을 소비할 때마다 대미지를 2점씩 더 경감할 수 있다. 단, 이 효과로 대미지를 0 이하로 만들 수는 없다.&&당신을 인도해준 봉마인 스승";
		abillity_data[49] = "범용&&비밀결사&&장비&&&&없음&&&&세션이 끝날 때, 「배드엔드표」를 사용하지 않았고 당신이 착란상태가 아니라면, 당신의 현재화한 【광기】 수만큼 공적점을 획득한다.&&뒤에서 음모를 꾸미는 비밀결사의 일원.";
		abillity_data[50] = "사실은 무서운 현대일본&&동정/처녀&&서포트&&부끄러움&&&&&&당신이 괴이에게 대미지를 입었을 때 사용할 수 있다. 지정특기 판정에 성공하면 그 대미지를 1D6점 감소할 수 있다. 이 어빌리티는 PC중에 행동불능이 된 자가 1명 이상 있으면 사용할 수 없다.&&왠지 불가사의한 힘에 보호받아, 최초의 희생자가 되는 일이 드물다.";
		abillity_data[51] = "사실은 무서운 현대일본&&기계공격&&공격&&기계&&&&&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 3D6점의 대미지를 입힌다. 단, 이 효과로 목표가 행동불능이 되지 않았다면, 이 어빌리티의 사용자는 괴이 특기 분야에서 무작위로 특기 하나를 선택하여 공포판정을 한다. 이 효과는 한 전투당 1회만 사용할 수 있다.&&중장비나 차 등을 사용한 공격.";
		abillity_data[52] = "사실은 무서운 현대일본&&과학적 설명&&서포트&&교양&&&&&&누군가가 괴이와 만나서 공포판정을 할 때 사용할 수 있다. 지정특기 판정에 성공하면 그 판정에 +2의 수정이 적용된다.&&괴이에 대해 억지로 말이 될 만한 설정을 갖다 붙인다.";
		abillity_data[53] = "사실은 무서운 현대일본&&링크 모음 사이트&&서포트&&미디어&&&&&&당신이 공포판정에 실패했을 때 사용할 수 있다. 지정특기 판정에 성공하면 공적점을 1점 획득할 수 있다. 이 효과로 공적점을 4점 이상 획득할 수는 없다.&&자기가 체험한 무서운 일을 WEB 게시판에 적는다. 무서우면 무서울수록 당신의 팬은 늘어날 것이다.";
		abillity_data[54] = "사실은 무서운 현대일본&&호러마니아&&장비&&&&없음&&&&세션이 시작할 때 괴이 에너미를 아무거나 두 종류 선택한다. 그 세션 동안 그 에너미와 만났을 때의 공포판정에 자동으로 성공한다.&&영화, 소설, 만화 … 다양한 작품을 통해 공포를 접했다.";
		abillity_data[55] = "사실은 무서운 현대일본&&명명&&서포트&&민속학&&&&&&당신이 그 세션에서 처음 보는 괴이 에너미와 만날 때 사용할 수 있다. 그 에너미의 이름을 생각하고 지정특기 판정을 한다. 성공하면 그 세션 동안 해당 에너미에 대한 조사판정이나 명중판정을 할 때 달성치가 1점 증가한다. 이 효과는 동종의 에너미에게는 누적되지 않는다.&&이름을 붙여서 그 괴물을 속박한다.";
		abillity_data[56] = "광란의 20년대&&원스 어폰 어 타임&&서포트&&&&없음&&&&당신이 누군가를 행동불능으로 만들었을 때 사용할 수 있다. 당신의 무기를 1개 소비하면 또 한 번 공격을 할 수 있다.&&옛날은 뭐든지 대범란 시대였다.";
		abillity_data[57] = "광란의 20년대&&위대한 개츠비&&서포트&&&&없음&&&&당신이 판정을 위해 주사위를 굴린 후에 사용할 수 있다. 아무거나 아이템을 1개 소비하면 그 판정의 달성치를 1점 증가시킬 수 있다.&&파란만장하고 화려한 인생.";
		abillity_data[58] = "광란의 20년대&&에비에이터&&서포트&&탈것&&&&&&당신이 참가하지 않은 제2라운드 시작부터 사용할 수 있다. 지정특기 판정에 성공하면 그 전투에 참가할 수 있다. 속도는 1D6을 굴려서 무작위로 결정한다. 그 속도에 당신 이외의 캐릭터가 있다면 그 중에서 원하는 만큼 목표를 선택한다. 목표에게 1D6점의 대미지를 입힌다(버팅은 발생하지 않는다).&&비행기나 기구 등에 타고 시원스럽게 날아든다.";
		abillity_data[59] = "광란의 20년대&&뜨거은 것이 좋아&&서포트&&&&없음&&&&당신이 감정판정에 성공해서 서로 플러스 【감정】을 획득했을 때 사용할 수 있다. 당신과 감정판정의 목표 중 한쪽을 목표로 하여 회복판정을 한 번 할 수 있다.&&화끈하고 뜨거운, 정렬적인 키스.";
		abillity_data[60] = "광란의 20년대&&언터처블&&장비&&&&없음&&&&착란상태가 되어도 【생명력】이나 【이성치】 소비 없이 「블록」, 「지원행동」, 「서포트 어빌리티」를 사용할 수 있다.&&공포나 유혹에 굴하지 않는 성실한 정신의 소유자.";
		abillity_data[61] = "광란의 20년대&&스카 페이스&&서포트&&협박&&&&&&당신이 누군가에게 대미지를 입혔을 때 사용할 수 있다. 같은 장면에 있는 당신 이외의 캐릭터 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표의 【이성치】를 1점 감소시킬 수 있다.&&암흑가의 방식으로 겁을 준다.";
		abillity_data[62] = "빅토리아의 어둠&&신사/숙녀&&서포트&&&&없음&&&&당신이 플러스 【감정】으로 감정수정을 했을 때 사용할 수 있다. 추가로 달성치를 1점 증가시킬 수 있다.&&예의 바르고 고결한 인물";
		abillity_data[63] = "빅토리아의 어둠&&동양 격투술&&공격&&구타&&&&&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 1D6점의 대미지를 입힌다. 또, 라운드가 끝날 때 목표의 속도를 대미지 결정 시에 굴린 1D6의 눈과 같은 속도로 변경한다.&&바리츠, 센도를 비롯한 동양의 격투기";
		abillity_data[64] = "빅토리아의 어둠&&고귀한 신분&&장비&&&&없음&&&&이 어빌리티를 습득한 캐릭터에 대해 마이너스 【감정】을 획득한 캐릭터는 【생명력】이나 【이성치】가 1점 감소한다.&&군림하는 왕후 귀족들";
		abillity_data[65] = "빅토리아의 어둠&&영매&&서포트&&영혼&&&&&&당신이 장면 플레이어인 드라마 장면에 사용할 수 있다. 당신의 【이성치】를 1점 감소시키고, 사망한 캐릭터 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표에 대해 조사판정을 할 수 있다.&&죽은 자의 말을 전할 수 있는 인물.";
		abillity_data[66] = "빅토리아의 어둠&&아편&&장비&&&&없음&&&&이 어빌리티는 《약품》 특기를 습득하지 않으면 습득할 수 없다. 아이템 진통제를 사용하면 추가로 【생명력】이나 【이성치】를 1점 더 회복할 수 있다.&&모르핀을 대량으로 포함한 마약. 높은 진통자굥이 뛰어나다지만, 자주 사용하면 폐인이 된다.";
		abillity_data[67] = "빅토리아의 어둠&&식민지 경험자&&장비&&&&없음&&&&생물 에너미를 공격하면 명중판정에 +1의 수정이 적용되고 대미지가 1D6점 증가한다.&&인도나 이집트 등 연국의 식민지에서 거침 인생을 보냈다.";
		abillity_data[68] = "이식&&해체&&공격&&분해&&&&&&목표 1명을 선택하여 명중판정을 한다. 명중판정에 성공하고 목표가 회피판정에 실패하면, 목표에게 1d6점의 대미지를 입힌다. 이 때 명중판정의 스페셜치는 11이다.&&그 생물의 취약한 사점(死点)을 찔러 해체한다.";
		abillity_data[69] = "이식&&염동&&공격&&포박&&&&&&생물이나 기물 에너미, 또는 PC 중에서 목표를 1명 선택하여 명중판정을 한다.명중판정에 성공하고 목표가 회피판정에 실패하면, 목표에게 1D6+3점의 대미지를 입힌다.&&사이코키네시스로 목표를 옭아맨다.";
		abillity_data[70] = "이식&&복수&&공격&&&&정서 분야에서 아무거나&&당신의 소중한 사람이 사망했다.&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 1d6-1점의 대미지를 입힌다. 이 때 현재화한 【광기】가 하나 있을 때마다 추가로 1점씩 대미지가 증가한다.&&누군가를 지키지 못한 기억이 당신을 복수귀로 만든다.";
		abillity_data[71] = "이식&&살육연쇄&&공격&&&&폭력 분야에서 아무거나&&당신이 누군가를 죽였다.&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 1D6+(이 세션에서 당신이 행동불능으로 만든 캐릭터의 수)만큼의 대미지를 입힌다.&&죽이고 또 죽이는 행위.";
		abillity_data[72] = "이식&&재액의 날&&공격&&종말&&&&배드엔드표를 사용했다.&&목표 1명을 선택하여 명중판정을 한다. 명중판정이 성공하고 목표가 회피판정에 실패하면, 목표에게 2D6+6점의 대미지를 입힌다. 이 효과는 한 전투당 1회밖에 사용할 수 없다.&&낙뢰나 지진 등의 재해가 일어나는 장소로 목표를 유인한다.";
		abillity_data[73] = "이식&&성가&&공격&&친애&&&&당신의 【사명】을 달성했다.&&괴이 에너미 중에서 원하는 만큼 목표를 선택하고 명중판정을 한다. 명중판정이 성공하면, 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 3점의 대미지를 입힌다.&&괴이를 퇴치하는 성스러운 노래.";
		abillity_data[74] = "이식&&환시&&서포트&&&&정서 분야에서 아무거나&&&&당신이 장면 플레이어인 드라마 장면에서 사용할 수 있다. 지정특기 판정에 성공하면 【광기】 덱의 카드를 위에서부터 3장 볼 수 있다. 그 후, 그 3장을 뒤집어서 임의의 순서대로 덱 위에 놓는다.&&미래에 일어날 불행을 한순간 엿본다.";
		abillity_data[75] = "이식&&시침바느질&&서포트&&&&폭력 분야에서 아무거나&&&&【광기】 덱이 모두 없어졌을 때 사용할 수 있다. 1D6과 같은 수만큼 추가 장면이 발생한다. 추가 장면이 모두 경과할 때까지 게임은 끝나지 않는다(규칙이나 시나리오에서 상정된 리미트를 초과해서 장면을 추가할 수는 없다). 단, 그 후 【광기】가 1장 공개되는 효과가 발생할 때마다 추가 장면의 수가 하나씩 감소한다. 추가 장면의 수가 0 이하가 되면 게임은 끝난다. 이 효과는 한 세션에 1회만 사용할 수 있다.&&재앙이 닥치기까지의 시간을 조금이나마 늦춘다.";
		abillity_data[76] = "이식&&꿈의 경고&&서포트&&의학&&정서 분야에서 아무거나, 의학&&&&누군가가 【광기】의 효과로 당신에게 대미지를 입히려 할 때 사용한다. 지정특기 판정에 성공하면 그 대미지를 무효로 할 수 있다.&&악의나 흉수로부터 몸을 지키는 예언.";
		abillity_data[77] = "이식&&결계&&서포트&&&&정서 분야에서 아무거나&&&&지원행동. 지정특기 판정에 성공하면 3+(판정의 달성치)만큼의 방호점을 획득한다. 그 후, 같은 장면에 등장한 캐릭터가 괴이 에너미에게 대미지를 입으면 방호점 0점이 될 때까지 원하는 만큼 감소시킬 수 있다. 감소한 방호점만큼 그 대미지를 경감할 수 있다. 이 효과는 그 장면이 끝날 대까지 유지되며, 같은 장면 동안에는 1회만 사용할 수 있다.&&괴이로부터 몸을 지키는 결계를 친다.";
		abillity_data[78] = "이식&&수호령&&서포트&&&&지각 분야에서 아무거나&&당신의 소중한 사람이 사망했다.&&누군가가 대미지를 입었을 때 사용할 수 있다. 그 대미지를 무효로 할 수 있다. 이 효과는 한 세션에 1회만 사용할 수 있다.&&당신을 지키기 위해 이전의 세계에서 함께 넘어온 수호령.";
		abillity_data[79] = "이식&&임사체험&&서포트&&&&지각 분야에서 아무거나&&당신이 사망했다.&&당신의 【생명력】이 0점이 되었을 때 사용할 수 있다. 당신의 【생명력】을 1D6점 회복할 수 있다. 이 효과는 한 세션에 1회만 사용할 수 있다.&&사후 세계를 체험하고 부활한다.";
		abillity_data[80] = "이식&&암흑윤리&&서포트&&&&기술 분야에서 아무거나&&당신이 신 속성 에너미와 만났다.&&당신이 【광기】를 공개했을 때 사용할 수 있다. 당신의 【생명력】이나 【이성치】를 1점 회복할 수 있다.&&광기 속에야말로 진실이 숨겨져 있다. 마음을 해방함으로써 힘이 솟아나고 마음이 편안해진다.";
		abillity_data[81] = "이식&&근원법칙&&서포트&&친애&&지각 분야에서 아무거나, 친애&&당신이 한 장도 【광기】를 공개하지 않았다.&&이 이식을 습득하면 폭력 특기분야 좌측의 갭을 검게 칠한다. 당신이 지정된 특기 대신 다른 특기를 쓸 때 사용할 수 있다. 당신의 【생명력】이나 【이성치】를 1점 감소하면 특기 리스트의 폭력 분야와 괴이 분야가 연결된 것으로 간주한다. 예컨대 《마술》 대신 《구타》를 사용한다면 목표치는 6이 된다.&&폭력이 모든 것을 해결해준다는 신념.";
		abillity_data[82] = "이식&&괴로운 기억&&서포트&&마술&&지식 분야에서 아무거나, 마술&&당신이 【사명】을 달성할 수 없었다.&&당신이 재도전을 할 때 사용할 수 있다. 그 재도전 판정에 +1의 수정을 적용한다.&&과거에 실패했던 기억이 성공을 향한 집착을 낳는다.";
		abillity_data[83] = "이식&&신의 이치&&서포트&&&&지식 분야에서 아무거나&&당신이 착란상태가 됐다.&&당신이 자신의 【이성치】를 소비, 감소시키는 어빌리티의 효과를 사용했을 때 사용할 수 있다. 당신의 【이성치】가 2점 이하라면 그 【이성치】의 소비 및 감소를 무효로 할 수 있다.&&아슬아슬한 시점까지 몰렸을 때 이계의 이치를 떠올린다.";
		abillity_data[84] = "이식&&광기감염&&서포트&&6.괴이&&괴이 분야 가변&&당신이 다른 누군가와 서로 플러스 【감정】을 맺었다.&&자기 차례에 사용할 수 있다. 전투 중에는 지원행동으로 간주한다. 같은 장면에 등장한 캐릭터 중에서 당신에 대해 플러스 【감정】을 가진 캐릭터 1명을 목표로 선택한다. 당신의 【이성치】를 1점 소비하고 정서 분야에서 무작위로 특기 하나를 선택해서 판정한다. 성공하면 당신의 현재화한 【광기】 중에서 1장을 고르고, 목표에게 그 【광기】를 현재화시킨다. 한 번 이 효과의 대상이 된 상대를 다시 목표로 선택할 수는 없다.&&당신에게 마음을 연 자는 당신의 광기에 전염된다.";
		abillity_data[85] = "이식&&공포 이야기꾼&&서포트&&&&지식 분야에서 아무거나&&당신이 공포판정에 실패했다.&&자기 차례에 사용할 수 있다. 전투 중에는 지원행동으로 간주한다. 임의의 특기 하나를 선택하고, 그 장면에 등장한 캐릭터 중 아무나 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표의 【공포심】에 그 특기를 추가할 수 있다. 이 효과는 그 세션동안 지속되며, 같은 목표에게 누적되지 않는다.&&무서운 경험을 이야기해서 그 공포를 심는다.";
		abillity_data[86] = "이식&&예언서&&장비&&&&없음&&없음&&세션이 시작할 때 PC 중에서 2명까지 캐릭터를 선택한다. 그 캐릭터의 【거처】를 획득한다.&&지난번 세계의 자신이 썼던, 친구들에 대한 메모.";
		abillity_data[87] = "이식&&허공장보살&&장비&&&&없음&&없음&&세션이 시작할 때 당신의 【호기심】이 아닌 특기 분야를 아무거나 하나 선택한다. 그 세션동안 그 분야에 속하는 특기로 판정할 때도 재도전을 할 수 있게 된다.&&평행세계의 지식이 모여있는 기록에 접속할 수 있다.";
		abillity_data[88] = "이식&&오파츠&&장비&&&&없음&&세션이 끝날 때 당신이 프라이즈를 소지하고 있었다.&&자신이 입힐 수 있는 대미지가 2점 증가한다. 또, 이 이식은 무기 아이템으로 사용할 수도 있다. 무기로 사용했다면 그 세션이 끝날 때까지 이 이식은 미습득 상태가 된다.&&당신이 가지고 온, 이 세계에 있을 리가 없는 물품.";
		abillity_data[89] = "이식&&파워 스폿&&장비&&&&없음&&없음&&회복판정에 성공했을 때 【생명력】을 회복하기로 했다면, 회복하는 수치가 1점이 아니라 1D6점이 된다.&&이세계에서 힘이 흘러들어오는 역장(力場)에 관한 지식.";
		abillity_data[90] = "이식&&성흔&&장비&&&&없음&&당신이 신 속성 에너미에게 대미지를 입었다.&&전투 중에 당신을 공격한 캐릭터는 공포판정을 한다(에너미라면 【생명력】을 1점 감소한다). 이 효과로 한 번이라도 공포판정을 한 캐릭터는 이 이식으로 인한 공포에 적응한다.&&신이 그 몸에 새긴 상처.";
		abillity_data[91] = "이식&&시간 여행기&&장비&&&&없음&&당신이 이전에 있던 시대와는 다른 시대로 이동했다.&&당신은 다른 월드 세팅의 어빌리티를 습득할 수 있다.&&자신이 이전에 있던 세계에서 사용했던 이능에 관련된 기억.";
		abillity_data[92] = "에너미&&최면&&서포트&&놀람&&&&&&지원행동. 다라마 장면에서도 사용할 수 있다. 목표를 1명 선택한다. 목표는 《놀람》으로 판정해야 한다. 여기에 실패하면 특기를 무작위로 하나 고른다. 그 세션이 끝날 때까지 그 특기가 목표의 【공포심】에 추가된다.&&";
		abillity_data[93] = "에너미&&정신감응&&서포트&&육감&&&&&&플롯을 할 때 사용할 수 있다. 목표를 1명 선택하고 《육감》 판정을 한다. 성공하면 목표의 플롯을 들을 수 있다.&&";
		abillity_data[94] = "에너미&&PK&&서포트&&암흑&&&&&&라운드가 시작할 때 사용할 수 있다. 플롯 공개 후 버팅 처리를 하기 전에 아무나 캐릭터 1명을 목표로 선택한다. 목표의 속도를 무작위로 변경한다.&&";
		abillity_data[95] = "에너미&&흉내&&서포트&&혼돈&&&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 목표를 1명 선택한다. 목표는 《혼돈》으로 판정해야 한다. 이 판정이 실패하면 이 에너미는 목표가 습득하고 있는 것 중 임의의 특기와 어빌리티를 하나씩 습득할 수 있다. 이 효과는 누적되지 않으며, 그 장면 동안 지속된다.&&";
		abillity_data[96] = "에너미&&환영&&서포트&&꿈&&&&&&지원행동. 목표를 1명 선택한다. 목표는 《놀람》으로 판정해야한다. 이 판정이 실패하면 목표는 1D6라운드 후의 새 라운드가 시작할 때까지, 공격을 할 때 무작위로 목표를 선택한다.&&";
		abillity_data[97] = "에너미&&빙의&&서포트&&&&아무거나&&&&지원행동. 목표를 1명 선택한다. 목표는 이 어빌리티의 지정특기로 판정해야 한다. 이 판정이 실패하면, 목표는 이 에너미에게 빙의당한다. 빙의한 에너미가 대미지를 입으면 1D6을 굴린다. 홀수라면 빙의당한 목표가 그 대미지를 입는다. 이 효과는 빙의한 에너미가 대미지를 입을 때까지 계속된다.&&";
		abillity_data[98] = "에너미&&불청객&&서포트&&함정&&&&&&「지옥의 저택」안에서 전투할 때, 라운드가 종료되는 시점에서 사용할 수 있다. 원하는 만큼 목표를 선택한다. 목표는 《함정》으로 판정해야 하며, 여기에 실패하면 1점의 대미지를 입는다.&&";
		abillity_data[99] = "에너미&&독전파&&서포트&&&&아무거나&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 목표 1명을 선택한다. 목표는 이 어빌리티의 지정특기로 판정해야 하며, 여기에 실패하면 미공개 【광기】를 무작위로 1장 선택해서 공개한다.&&";
		abillity_data[100] = "에너미&&비행&&서포트&&우주&&&&&&라운드가 종료될 때 사용할 수 있다. 《우주》 판정에 성공하면 【전장이동】을 사용할 수 있다.&&";
		abillity_data[101] = "에너미&&매료&&서포트&&암흑&&&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 목표를 1명 선택한다. 목표는 《놀람》으로 판정을 해야 하며, 여기에 실패하면 그 사이클이 끝날 때까지 착란상태가 된다. 이 캐릭터에 대해 【감정】을 가지고 있는 캐릭터에게는 -4의 수정이 적용된다.&&";
		abillity_data[102] = "에너미&&따라다니기&&서포트&&협박&&&&&&전투 중에 이 에너미가 버팅에 말려들었을 때 사용할 수 있다. 이 에너미와 버팅을 한 캐릭터 1명을 목표로 한다. 목표는 《협박》특기로 공포판정을 해야 한다.&&";
		abillity_data[103] = "에너미&&원통하도다!&&서포트&&원한&&&&&&이 에너미의 【생명력】이 0이 되었을 때 사용할 수 있다. 이 에너미의 【생명력】을 감소한 캐릭터 1명을 목표로 한다. 목표는 《원한》특기로 공포판정을 해야한다.&&";
		abillity_data[104] = "에너미&&이런 얼굴?&&서포트&&&&없음&&&&캐릭터가 조사판정 또는 감정판정에 실패했을 때 사용할 수 있다. 그 캐릭터를 목표로 한다. 목표는 《풍경》으로 공포판정을 해야 한다.&&";
		abillity_data[105] = "에너미&&정찰&&서포트&&풍경&&&&&&플롯을 할 때 사용할 수 있다. 캐릭터 1명을 목표로 선택한다. 목표는 《풍경》으로 판정을 해야 한다. 이 판정이 실패하면 목표의 플롯치를 알아낼 수 있다.&&";
		abillity_data[106] = "에너미&&피 냄새&&서포트&&&&없음&&&&이 에너미가 1점이라도 대미지를 입혔을 때 사용한다. 대미지를 입은 캐릭터 1명을 목표로 한다. 목표의 【거처】를 획득한다.&&";
		abillity_data[107] = "에너미&&맹독&&서포트&&효율&&&&&&이 캐릭터가 목표에게 1점이라도 대미지를 입혔을 때 사용할 수 있다. 《효율》판정을 한다. 성공하면 목표는 그 장면 동안 라운드가 끝날 때마다 1점의 대미지를 입는다(같은 대상에게 여러 번 사용해도 라운드가 끝날 때 입는 대미지는 누적되지 않는다).&&";
		abillity_data[108] = "에너미&&물건수집&&서포트&&추적&&&&&&이 에너미가 1점이라도 대미지를 입혔을 때 사용할 수 있다. 대미지를 입은 캐릭터 1명을 목표로 한다. 목표는 《추적》으로 판정을 한다. 이 판정에 실패하면 목표는 가지고 있는 아이템 1개를 이 에너미에게 넘겨야 한다.&&";
		abillity_data[109] = "에너미&&나 예뻐?&&서포트&&부끄러움&&&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 캐릭터 1명을 목표로 선택한다. 목표는 《부끄러움》으로 판정을 한다. 이 판정이 실패하면 목표에게 1점의 대미지를 입힌다. 이 에너미가 목표에 대해 플러스 【감정】을 가지고 있다면 목표에게 입히는 대미지가 3점으로 변경된다.&&";
		abillity_data[110] = "에너미&&기다리기&&서포트&&&&&&&&지원행동. 드라마 장면에서 사용할 수 있다. 캐릭터 1명을 목표로 선택한다. 목표에 대해 다른 캐릭터가 새로 플러스 【감정】을 획득했을 때, 그 캐릭터에게 전투를 걸 수 있다.&&";
		abillity_data[111] = "에너미&&흉조&&서포트&&육감&&&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 목표를 1명 선택한다. 목표는 다음 장면이 시작할 때 《육감》으로 공포판정을 해야 한다.&&";
		abillity_data[112] = "에너미&&생명 창조&&서포트&&생물학&&&&&&지원행동. 전투에서 사용할 수 있다. 《생물학》판정을 한다. 판정에 성공하면 「실패작」(기본p250) 하나를 다음 라운드 동안 등장시킬 수 있다. 속도는 1D6을 굴려서 무작위로 결정한다(버팅은 발생하지 않는다).&&";
		abillity_data[113] = "에너미&&모서리에서 실체화&&서포트&&수학&&&&&&전투에서 라운드가 끝날 때, 누군가가 자발적으로 탈락을 선언했고 이 에너미가 방해를 선언했을 때 사용할 수 있다. 그 도주판정에 사용하는 특기는 《수학》이 되며, 도주판정에 -3의 수정이 적용된다.&&";
		abillity_data[114] = "에너미&&부정한 계약&&서포트&&&&없음&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 목표를 1명 선택한다. 목표는 이 세션에서 한 번만 【소환】 또는 【탄원】 어빌리티를 사용할 수 있다. 단, 이 어빌리티로 감소하는 【이성치】는 2점이다.&&";
		abillity_data[115] = "에너미&&기억소거&&서포트&&분해&&&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 목표 1명을 선택한다. 목표는 《분해》로 판정해서 실패하면 자신의 【비밀】과 자신의 【거처】 이외의 【정보】를 모두 잃는다.&&";
		abillity_data[116] = "에너미&&껄끄러움&&서포트&&부끄러움&&&&&&지원행동. 드라마 장면에서도 사용할 수 있다. 이 에너미가 등장했을 때, 캐릭터 1명을 목표로 한다. 목표와 이 에너미가 같은 장면에 있는 동안, 목표와 에너미의 펌블치가 2점 증가한다.&&";
		abillity_data[117] = "에너미&&정신 탈취&&서포트&&함정&&&&&&지원행동. 캐릭터 1명을 목표로 한다. 목표는 《함정》으로 판정을 한다. 여기에 실패하면 목표가 다음에 하는 공격의 목표는 GM이 결정할 수 있다.&&";
		abillity_data[118] = "에너미&&삼각전차&&장비&&&&없음&&&&이 에너미의 【난동】이 입히는 대미지가 2점 증가한다.&&";
		abillity_data[119] = "에너미&&군단&&장비&&&&없음&&&&자신의 몹이 대미지를 입었을 때, 몹의 【위협도】가 2점 높은 것으로 간주한다.&&";
		abillity_data[120] = "에너미&&인형의 사랑&&장비&&&&없음&&&&이 캐릭터가 플러스 【감정】을 가진 캐릭터는 이 에너미 이외의 캐릭터에 대해 【감정】을 획득할 때마다 《연심》특기로 공포판정을 해야 한다.&&";
		abillity_data[121] = "에너미&&종복&&장비&&&&없음&&&&자신의 몹이 모두 자신에 대해 「애정」의 【감정】을 가지고 있는 것으로 간주한다.&&";
		abillity_data[122] = "에너미&&악몽의 주인&&장비&&&&없음&&&&이 에너미가 【거처】를 가진 캐릭터는 자신이 장면 플레이어인 장면이 끝날 때 《꿈》 특기로 공포판정을 해야 한다.&&";
		abillity_data[123] = "에너미&&공포의 영상&&장비&&&&없음&&&&이 에너미와는 만날 때마다 공포판정을 해야만 한다.&&";
		abillity_data[124] = "에너미&&죽음의 사냥개&&장비&&&&없음&&&&이 에너미가 【거처】를 가진 캐릭터는 각 사이클이 끝날 때 【생명력】이 1점 감소한다.&&";
		abillity_data[125] = "에너미&&짓뭉개기&&장비&&&&없음&&&&이 캐릭터와 함께 버팅이 발생한 캐릭터는 추가로 1점의 대미지를 입는다.&&";
		abillity_data[126] = "에너미&&신성&&장비&&&&없음&&&&이 에너미와 버팅한 캐릭터는 2D6점의 대미지를 입는다.&&";
		abillity_data[127] = "에너미&&고대의 저주&&장비&&&&없음&&&&이 에너미의 【비밀】을 획득한 캐릭터는 각 사이클이 끝날 때 【생명력】이 1점 감소한다.&&";
		abillity_data[128] = "에너미&&처형&&장비&&&&없음&&&&이 에너미의 공격에 대한 회피판정의 펌블치는 목표의 현재화한 【광기】 수 만큼 증가한다.&&";
		abillity_data[129] = "에너미&&구불구불&&장비&&&&없음&&&&이 에너미의 【거처】를 가진 캐릭터는 자신이 장면 플레이어인 장면이 끝날 때 《혼돈》으로 공포판정을 해야 한다.&&";
		abillity_data[130] = "에너미&&광기의 목소리&&장비&&암흑&&&&&&이 에너미를 목표로 조사판정을 하면 《암흑》특기로 공포판정을 해야 한다.&&";
		abillity_data[131] = "에너미&&계약의 표식&&장비&&&&없음&&&&이 에너미는 자신이 플러스 【감정】을 가진 캐릭터를 공격 목표로 삼을 수 없다. 이 에너미가 마이너스 【감정】을 가진 캐릭터를 목표로 하는 공격 대미지는 1D6점 증가한다.&&";
		abillity_data[132] = "에너미&&압도적 지식&&장비&&&&없음&&&&이 에너미는 지식 분야의 특기를 모두 습득한 것으로 간주한다.&&";
		abillity_data[133] = "에너미&&자동차의 질투&&공격&&노여움&&&&&&이 캐릭터가 플러스 【감정】을 가진 캐릭터 1명을 선택한다. 선택한 캐릭터가 플러스 【감정】을 가진 캐릭터 전원을 목표로 명중판정을 한다. 명중판정에 성공하면 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 1D6점의 대미지를 입힌다.&&";
		abillity_data[134] = "에너미&&생명 흡수&&공격&&생물학&&&&&&생물 에너미 또는 PC 전원을 목표로 선택해서 명중판정을 한다. 명중판정이 성공하면 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 1D6-1점의 대미지를 입히고, 대미지를 입힌 캐릭터의 수X2점만큼 이 에너미의 【생명력】이 회복한다.&&";
		abillity_data[135] = "에너미&&열선&&공격&&죽음&&&&&&이 에너미 이외의 캐릭터 전원을 목표로 명중판정을 한다. 목표는 각자 회피판정을 한다. 회피판정에 실패한 목표에게 2D6점의 대미지를 입힌다.&&";
		abillity_data[136] = "블랙 데이즈&&악플의 불바다&&공격&&&&소각, 미디어&&&&전투에 참가한 캐릭터(당신 포함) 중에서 【비밀】이 모두에게 공개된 캐릭터 전원을 목표로 선택하고, 지정특기로 명중판정을 한다. 명중판정이 성공하면 목표는 개별적으로 회피판정을 해야 한다. 회피판정에 실패한 목표 전원은 【이성치】가 [세션 동안 누가 사용했는지 불문하고 이 어빌리티가 사용된 횟수의 합계(최대 3점)]점 감소한다.&&정신적으로 몰아붙이는 말의 칼날이 폭풍처럼 쏟아진다. 이건 이제 막을 수 없다.";
		abillity_data[137] = "블랙 데이즈&&무적의 인물&&공격&&&&폭력 분야에서 아무거나&&&&목표 한 명을 선택하고 명중판정을 한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 목표에게 2D6점의 대미지를 입힌다. 이때, 목표가 입는 대미지와 같은 점수의 대미지를 입는다(다른 효과로 대미지가 상승했다면 그것도 포함).&&어떤 것에도 얽매이지 않고, 자신의 목숨조차 무가치하게 여기는 무시무시한 공격";
		abillity_data[138] = "블랙 데이즈&&서브미션&&공격&&포박&&&&&&목표 한 명을 선택해서 지정특기로 명중판정을 한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 목표에게 [1D6점의 절반(소수점 이하 올림)]점의 대미지를 입힌다. 이때, 목표는 다음 라운드가 될 때까지 모든 판정에 -2의 수정을 적용하며, 자발적으로 탈락할 수 없게 된다. 또, 당신과 목표의 속도가 같다면 목표는 회피판정에 -2의 수정을 적용한다.&&상대에게 조르기를 걸어서 의식을 잃게 만드는 패왕의 기술";
		abillity_data[139] = "블랙 데이즈&&크래셔&&공격&&&&파괴, 노여움&&&&기물 에너미 중에서 목표를 한 명 선택하고 명중판정을 한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 [2D6+획득한 미공개 【광기】의 수]점의 대미지를 입힌다. 이때, 기물 에너미의 대미지 제한 효과를 무효로 한다.&&갈 곳 없는 감정에 몸을 맡겨 분풀이를 한다.";
		abillity_data[140] = "블랙 데이즈&&선동 이동&&공격&&&&협박, 탈것&&&&당신보다 속도가 낮은 캐릭터 중에서 목표 한 명을 선택해 명중판정을 한다. 명중 판정이 성공하고, 목표가 회피판정에 실패하면 목표의 【이성치】를 2점 감소한다. 그 후, 당신과 목표의 속도를 교환한다(이 공격 직후에 목표의 차례가 된다. 그 라운드에 【선동 이동】을 한 캐릭터에게는 그 라운드 동안 더 이상 차례가 발생하지 않는다).&&아슬아슬한 거리까지 뒤에 따라붙거나, 집요하게 방해를 해서 상대의 신경을 건드린다.";
		abillity_data[141] = "블랙 데이즈&&어벤저&&공격&&풍경&&정서 분야에서 아무거나, 풍경&&&&당신의 핸드아웃에 적힌 【비밀】에 등장하는 캐릭터 한 명을 목표로 선택하고 명중판정을 한다. 이때, 목표는 속도와 관계없이 이 어빌리티의 지정특기로 회피판정을 한다. 또, 회피판정에 -1의 수정을 적용한다. 공격이 명중하고, 목표가 회피에 실패하면 1D6점의 대미지를 입힌다. 또, 이 공격을 할 때 회상 장면으로 대미지를 상승시키면 추가로 1D6점의 대미지를 입힐 수 있다.&&그때의 네 얼굴을 한 순간도 잊은 적이 없어!";
		abillity_data[142] = "블랙 데이즈&&스턴건&&공격&&기계&&&&&&당신과 같은 속도, 또는 당신과 한 칸 떨어진 속도에 있는 캐릭터 1명을 목표로 선택해서 명중판정을 한다. 명중판정이 성공하고, 목표가 회피판정에 실패하면 목표는 그 라운드 동안 명중판정과 회피판정에 -4의 수정을 적용한다.&&힘 없는 사람이라도 폭력에 대항할 수단은 있는 법이다. 그렇다, 현대 과학을 동원한다면!";
		abillity_data[143] = "블랙 데이즈&&백열쏘기&&공격&&&&효율, 시간&&&&목표를 한 명 선택해서 명중판정을 한다. 목표가 회피판정에 실패하면, 목표에게 1점의 대미지를 입힌다. 그 후, 어빌리티 사용자는 실패할 때까지 지정특기 판정을 반복해서 성공할 때마다 1점의 대미지를 입힌다(최대 6점). 어빌리티 사용자는 그 라운드동안 회피판정에 자동으로 실패한다.&&상대를 파괴하기 위해, 모든 것을 최적의 수단으로.";
		abillity_data[144] = "블랙 데이즈&&디스암&&공격&&&&파괴, 분해&&&&목표를 1명 선택하고 명중판정을 한다. 목표는 회피판정에 -2의 수정을 적용한다. 회피판정에 실패하면 목표가 소지한 아이템 중에서 무작위로 1개를 골라 그것을 소비시킨다. 이때, 목표가 아이템을 하나도 가지고 있지 않다면 아이템을 소비하는 효과를 적용하는 대신 그 전투 동안 목표가 입는 대미지를 1점 상승시킨다(이 효과는 6점까지 누적된다).&&무장을 해제해서 상대를 몰아넣는다.";
		abillity_data[145] = "블랙 데이즈&&채팅 어플&&서포트&&전자기기&&&&&&당신이 참가하지 않은 전투가 개시될 때 사용할 수 있다. 전투에 참가한 캐릭터 1명을 목표로 선택한다. 목표의 【거처】를 획득하고 있다면 지정특기 판정에 성공할 경우 그 전투에 난입한다.&&오케, 오케. 됐으니까 지금 어디 있는지 맵 스샷 찍어서 보내줄래?";
		abillity_data[146] = "블랙 데이즈&&인플루언서&&서포트&&미디어&&&&&&당신이 조사 판정을 할 때 사용할 수 있다. 지정특기 판정에 성공하면 당신은 다음에 할 조사 판정에 +2의 수정을 적용한다. 또, 그 판정 동안 펌블치가 2점 상승한다.&&발언한 내용이 그대로 세계의 진실이 된다. 그것은 바꿔 말하면 항상 위험이 따른다는 의미다.";
		abillity_data[147] = "블랙 데이즈&&안티&&서포트&&&&없음&&&&같은 장면에 등장한 당신 이외의 캐릭터가 행동판정을 할 때 사용할 수 있다. 그 판정의 지정특기가 당신의 「호기심」분야에 속하는 특기라면 목표를 1명 선택한다. 목표는 그 판정에 -2의 수정을 적용한다. 그 후, 당신은 【광기】를 하나 획득한다.&&하아? 제대로 검증한 거야? 잘못 해석한 거겠지. 그럴 리가 없어!";
		abillity_data[148] = "블랙 데이즈&&스캔들&&서포트&&&&추적, 카메라&&&&누군가(당신 포함)가 캐릭터를 목표로 하는 조사판정에 실패했을 때 사용할 수 있다. 지정특기 판정에 성공하면 그 조사판정의 결과를 성공으로 변경한ㄷ. 이때, 시나리오상 설정된 특수한 조건이 있는 경우가 아니라면 그 조사판정으로 획득한 【정보】는 확산정보가 된다(【거처】를 획득했다면 PC 전원이 그 【거처】를 획득한다).&&솔직하게 말해주지 않으니까 이 꼴이 나잖아요. 사람들은 다들 알고 싶어한다구요!";
		abillity_data[149] = "블랙 데이즈&&가정 의학&&서포트&&&&약품, 의학&&&&당신이 회복판정을 할 때 사용할 수 있다. 지정특기 판정에 성공하면 추가로 【생명력】이나 【이성치】를 2점 회복한다. 단, 그 회복판정에 펌블이 발생하면 해당 회복판정의 목표에게 1점의 대미지를 입힌다.&&나 이거 알아! TV에서 봤으니까 할 수 있어!";
		abillity_data[150] = "블랙 데이즈&&원 팀&&서포트&&고통&&&&&&당신 이외의 PC가 대미지를 입었을 때 사용할 수 있다. 대미지를 입은 캐릭터를 2명까지 목표로 선택한다. 지정특기 판정에 성공하면 목표가 입은 대미지를 2점까지 경감하고, 당신이 대신 그 대미지를 입을 수 있다. 이때 당신의 【이성치】를 2점 감소한다.&&맡겨둬! 우리는 하나야!";
		abillity_data[151] = "블랙 데이즈&&트랩 룸&&서포트&&함정&&&&&&플롯을 할 때 사용할 수 있다. 지정특기 판정에 성공하면 속도를 결정하는 주사위를 1개 더 준비한다. 주사위 눈을 공개한 후, 두 개의 주사위 중 한쪽을 당신의 속도로 정하고, 나머지 한쪽 주사위에 해당하는 속도에 위치한 캐릭터 전원에게 2점의 대미지를 입힌다(2명 이상이 동시에 사용했다면 1D6을 굴려서 더 높은 눈이 나온 쪽부터 순서대로 처리한다).&&이 집에 발을 들인 게 네 실수다.";
		abillity_data[152] = "블랙 데이즈&&은폐공작&&서포트&&매장&&&&&&당신이 참가한 전투에서 당신 이외의 PC가 승리했을 때 사용할 수 있다. 지정특기 판정에 성공하면 전과로 당신의 【정보】를 획득할 수 없게 한다.&&나는 새는 뒤를 어지르지 않는다.";
		abillity_data[153] = "블랙 데이즈&&지난 날의 약속&&서포트&&풍경&&&&&&클라이맥스 페이즈에 당신이 판정을 할 때 사용할 수 있다. 지정특기 판정에 성공하면 「회상 장면」의 달성치 상승 효과를 사용할 수 있다(이 회상 장면은 당신의 【비밀】과 관계가 없는 내용을 연출한다). 이 효과는 세션마다 한 번씩 할 수 있다.&&놈은 반드시 나타난다. 그때는 우리가 끝장을 보자!";
		abillity_data[154] = "블랙 데이즈&&위험한 태클&&서포트&&&&폭력 분야에서 아무거나&&&&전투 중에 당신이 버팅에 말려들었을 때 사용할 수 있다. 지정특기 판정에 성공하면 당신과 같은 속도에 있는 당신 이외의 캐릭터가 버팅으로 입는 대미지를 2점 상승시킨다.&&이럴 때 부숴두지 않으면 의미가 없잖아?";
		abillity_data[155] = "블랙 데이즈&&구조 분석&&서포트&&&&생물학, 의학, 물리학&&&&지원행동. 괴이, 현상, 기물, 신 에너미를 1명 선택한다. 당신의 【이성치】를 1점 감소하고, 지정특기 판정에 성공하면 그 전투 동안 목표는 생물 속성을 획득한다.&&놀랄 것 없어. 이런 부분은 살아있는 인간과 하나도 다를 게 없으니까.";
		abillity_data[156] = "블랙 데이즈&&변호&&서포트&&교양&&&&&&당신이 등장한 장면에서 당신 이외의 누군가가 감정판정에 실패했을 때 사용할 수 있다. 감정판정을 한 캐릭터 1명을 목표로 선택한다. 지정특기 판정에 성공하면 목표는 한 번 더 감정판정을 한다. 목표가 당신에 대해 마이너스 【감정】을 획득한 상태라면, 그 【감정】을 플러스 속성의 다른 감정으로 변경할 수 있다.&&지식과 궤변을 구사해서 유죄를 무죄로.";
		abillity_data[157] = "블랙 데이즈&&가설&&서포트&&&&지식 분야에서 아무거나&&&&지원행동. 현상 에너미 중에서 목표를 1명 선택하고 지정특기 판정을 한다. 그 전투 동안 목표가 습득한 특기를 2종류까지 선택한다. 목표를 공격할 때, 해당하는 특기가 지정특기라면 명중판정에 대한 -5의 수정과 펌블치 2점 상승 효과를 무효로 한다.&&드디어 알아냈다. 놈의 정체를! 쓰러뜨릴 방법을!";
		abillity_data[158] = "블랙 데이즈&&감시 위성&&서포트&&우주&&&&&&당신이 조사판정에 성공했을 때 사용할 수 있다. 조사판정의 목표는 -2의 수정을 받고 이 어빌리티의 지정특기로 판정해야 한다. 그 판정에 실패할 경우, 이 어빌리티의 사용자는 조사판정 목표의 【거처】를 획득할 수 있다.&&우주의 눈은 피할 수 없다. 어디에서 뭘 하는지 훤히 들여다보지. 아아, 무서워라.";
		abillity_data[159] = "블랙 데이즈&&과금 가챠&&서포트&&꿈&&&&&&메인 페이즈 동안 당신의 장면을 종료할 때 사용할 수 있다. 당신의 【이성치】를 1점 감소하고 지정특기 판정을 한다. 판정에 성공하면 2D6을 굴린다. 그 결과가 2~6이라면 【광기】를 하나 획득한다. 7이라면 회복판정, 8~9라면 감정판정, 10~11이라면 조사판정, 12라면 원하는 주요 행동을 한 번 할 수 있다.&&돌려라, 돌려! 찰나의 서비스를 위해. 인생이란 걸어다니는 그림자올시다.";
		abillity_data[160] = "블랙 데이즈&&블랙 기업&&장비&&&&없음&&&&당신 이외의 누군가가 【광기】를 획득했을 대, 그 【광기】 하나를 당신이 대신 획득할 수 있다. 이 효과는 세션마다 한 번씩만 적용할 수 있다. 이 어빌리티는 여러 번 습득할 수 있다.&&아, 제가 처리해 둘께요….";
		abillity_data[161] = "블랙 데이즈&&화이트 기업&&장비&&&&없음&&&&당신의 【생명력】 최대치가 1점 상승한다. 또, 추가로 아이템을 1개 가져간다.&&아, 저한테 맡겨주세요!";
		abillity_data[162] = "블랙 데이즈&&현대의 귀족&&장비&&&&없음&&&&누군가가 당신을 목표로 조사판정이나 감정판정을 했을 때, 그 판정에 -1의 수정을 적용할 수 있다.&&누구도 내게 뭐라 할 수 없어. 누구도!";
		abillity_data[163] = "블랙 데이즈&&사연 있는 주택&&장비&&&&없음&&&&당신이 괴이에 대하 공포판정을 할 때, 그 판정에 +1의 수정을 적용한다.&&익숙하거든. 매일 별꼴을 다 당하니까.";
		abillity_data[164] = "블랙 데이즈&&스트롱 에너지&&장비&&&&없음&&&&「진통제」를 사용해서 【생명력】을 회복할 때, 회복하는 【생명력】 수치를 1점 증가시킬 수 있다. 회복량을 높였다면, 그 후에 당신의 【이성치】가 1점 감소한다.&&이거 쩔어! 힘이 솟아 나는 것 같아!";
		abillity_data[165] = "블랙 데이즈&&수호령&&장비&&&&없음&&&&당신이 《영혼》을 지정특기로 사용하는 특정 판정에 성공했을 때, 당신이 획득한 【광기】하나를 선택해서 게임으로부터 제외한다(미공개 【광기】를 선택했다면 제외하기 전에 공개한다). 그 후, 당신은 임의의 아이템을 하나 획득한다. 이 효과는 세션마다 한번씩만 적용할 수 있다.&&괜찮아, 당신은 내가 지켜줄 거니까.";
		abillity_data[166] = "블랙 데이즈&&무신론자&&장비&&&&없음&&&&신 에너미와 조우했을 때, 당신이 공포판정으로 획득하는 【광기】를 하나 경감한다. 또, 당신이 신 에너미에게 입히는 대미지가 1D6점 증가한다.&&뭐든지 과학으로 해명할 수 있단 말이다! 이 사기꾼 자식아!";
		abillity_data[167] = "블랙 데이즈&&소꿉친구&&장비&&&&없음&&&&당신이 대미지를 입어 【생명력】이 0점이 되었을 때 사용할 수 있다. 당신의 【생명력】을 1점으로 변경하고, 당신의 【이성치】를 1점 회복한다. 이 어빌리티를 사용한 라운드에는 공격의 목표로 선택되지 않는다. 이 효과는 세션마다 한 번씩만 적용할 수 있다.&&부탁이야. 꼭 무사히 돌아와야 해!";
		abillity_data[168] = "블랙 데이즈&&애차&&장비&&&&없음&&&&당신의 속도가 3 이상일 때, 당신의 회피판정에 +1의 수정을 적용한다. 당신이 회피판정에 실패하면 그 세션을 종료할 때까지 이 효과를 잃는다.&&가자, 파트너. 한계(피리어드)를 넘어서!";
		abillity_data[169] = "블랙 데이즈&&꽃미남&&장비&&&&없음&&&&정서 분야의 특기를 지정특기로 사용하는 조사판정이나 감정판정을 할 때, 판정 달성치에 +1의 수정이 붙는다. 단, 그런 판정에 재도전을 할 때는 【생명력】이나 【이성치】를 1점 더 감소해야 한다. 또, 그런 판정에 실패하면 【생명력】이나 【이성치】를 2점 감소한다.&&여기저기 추파를 던져대지. 저러다 무슨 원한을 사서 언제 칼 맞을지 어떻게 알아?";
		abillity_data[170] = "블랙 데이즈&&소화기&&장비&&&&없음&&&&당신의 차례에 사용할 수 있다. 그 라운드 동안 「암흑상태」가 되며, 그 전투에 참가한 캐릭터 전원은 《소각》을 지정특기로 하는 공격의 대미지를 1D6점 경감한다. 이 효과는 세션마다 한 번씩만 적용할 수 있다.&&본래의 용도보다는 살인마로부터 도망치기 위해 쓰일 때가 많다. 주저 없이 사용하려면 연습을 통해 익숙해질 필요가 있다.";
		abillity_data[171] = "블랙 데이즈&&드론&&장비&&&&없음&&&&당신이 참가한 전투에서는 에너미가 명중판정에 -1의 수정을 적용한다. 이 효과는 최대 3점까지 누적된다. 이 어빌리티의 사용자가 참가한 전투에서 에너미는 지원행동으로 「드론 파괴」를 할 수 있다. 「드론 파괴」가 이루어지면 그 전투 동안 이 어빌리티는 미습득 상태가 된다.&&일회용 미끼치고는 퍽 비싸게 먹히는군.";

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	for(int i=0; i< abillity_data.length; i++) {
		int cnt = 0;
		int index = 7;
		String[] str_temp = abillity_data[i].split("&&");
		if(str_temp.length>index) {
			System.out.println(str_temp[index]);
		}else {
			System.out.println("");
		}
		/*
		for(String s : str_temp) {
			System.out.println(i + "/" + cnt + " : " + s );
			cnt++;
		}
		*/
	}
		/*
		
		int cnt2 = 0;
		String[] str_temp2 = abillity_data[0].split("&&");
		for(String s : str_temp2) {
			System.out.println(cnt2 + " : "+s);
			cnt2++;
		}
		System.out.println();
		*/
	}

}
