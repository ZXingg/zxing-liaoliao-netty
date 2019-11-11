package com.zxing.mapper;

import java.util.List;

import com.zxing.pojo.Users;
import com.zxing.pojo.vo.FriendRequestVO;
import com.zxing.pojo.vo.MyFriendsVO;
import com.zxing.utils.MyMapper;

public interface UsersMapperCustom extends MyMapper<Users> {
	
	public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);
	
	public List<MyFriendsVO> queryMyFriends(String userId);
	
	public void batchUpdateMsgSigned(List<String> msgIdList);
	
}