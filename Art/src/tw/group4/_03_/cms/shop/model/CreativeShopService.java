package tw.group4._03_.cms.shop.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("creativeShopService")
public class CreativeShopService implements ICreativeShopService {

	@Autowired
	private CreativeShopDAO creativeShopDAO;

	@Override
	public boolean checkShopId(int shopId) {
		return creativeShopDAO.checkShopId(shopId);
	}

	@Override
	public boolean checkReservation(int shopId) {
		return creativeShopDAO.checkReservation(shopId);
	}

	@Override
	public CreativeShopBean insert(CreativeShopBean bean) {
		return creativeShopDAO.insert(bean);
	}

	@Override
	public CreativeShopBean select(int shopId) {
		return creativeShopDAO.select(shopId);

	}

	@Override
	public List<CreativeShopBean> selectByShopId(int shopId) {
		return creativeShopDAO.selectByShopId(shopId);
	}

	@Override
	public List<CreativeShopBean> selectByShopName(String shopName) {
		return creativeShopDAO.selectByShopName(shopName);
	}

	@Override
	public List<CreativeShopBean> selectByMemberId(int memberId) {
		return creativeShopDAO.selectByMemberId(memberId);
	}
	
	@Override
	public List<CreativeShopBean> selectAll() {
		return creativeShopDAO.selectAll();
	}

	@Override
	public List<CreativeShopBean> selectByReservation(){
		return creativeShopDAO.selectByReservation();
	}
	
	@Override
	public List<CreativeShopBean> selectByShopNameAndReservation(String shopName){
		return creativeShopDAO.selectByShopNameAndReservation(shopName);
	}

	@Override
	public CreativeShopBean update(int shopId, String shopName, int memberId, String image, String intro,
			String cityName, String address, String openTime, String phone, String fax, String email, String facebook,
			String website, int clicks, int reservation) {
		return creativeShopDAO.update(shopId, shopName, memberId, image, intro, 
				cityName, address, openTime, phone, fax, email, facebook,
				website, clicks, reservation);
	}

	@Override
	public boolean delete(int shopId) {
		return creativeShopDAO.delete(shopId);
	}

}
