package tw.group4._03_.cms.aaa.model;
//package tw.group4._03_.cms.reservationPolicy.model;
//
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.GenericGenerator;
//import org.hibernate.annotations.Parameter;
//import org.springframework.stereotype.Component;
//
//import tw.group4._03_.cms.reservation.model.ShopReservationBean;
//
//@Entity
//@Table(name = "CS_RESERVATION_POLICY_TABLE")
//@Component("reservationPolicyBean")
//public class ReservationPolicyBean implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
////	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name="property", value = "books"))
////	@Id
////	@GeneratedValue(generator = "generator")
////	@Column(name = "SHOPID")
//	
//	@Id @Column(name = "SHOPID")
//	private int shopId;
//
//	@Column(name = "SHOPNAME")
//	private String shopName;
//
//	@Column(name = "PERMIT")
//	private String permit;
//	
//	@Column(name = "MAXIMUM")
//	private int maximum;
//
//	@Column(name = "DURATION")
//	private int duration;
//	
//	// ==================
//	
//	@Column(name = "OVERLAP")
//	private int overlap;
//	
//	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "reservationPolicyBean")
//	private Set<ShopReservationBean> shopReservationBean = new HashSet<ShopReservationBean>();
//	
//	// ==================
//	
//	public ReservationPolicyBean() {
//	}
//
//	// ==================
//
////	public ReservationPolicyBean(int reservationNo, String memberId, String name, int shopId, String shopName,
////			String customerName, String customerPhone, int adultsNum, int childrenNum, int amount, String startTime, String endTime) {
////
////		this.reservationNo = reservationNo;
////		this.memberId = memberId;
////		this.name = name;
////		this.shopId = shopId;
////		this.shopName = shopName;
////
////		this.customerName = customerName;
////		this.customerPhone = customerPhone;
////		this.adultsNum = adultsNum;
////		this.childrenNum = childrenNum;
////		this.amount = amount;
////		
////		this.startTime = startTime;
////		this.endTime = endTime;
////	}
//
//	// ==================
//
//}
