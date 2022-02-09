package com.hta.lecture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.hta.lecture.dto.WishlistDto;
import com.hta.lecture.vo.Wishlist;

@Mapper
public interface WishlistMapper {

	void addWishList(Wishlist wish);
	void deleteWishListByClassNoUserNo(Wishlist wishlist);
	List<WishlistDto> getWishClasstByUserNo(int no);
	Wishlist getWishByUserNoClassNo(Wishlist wishlist); // 위시리스트 중복조회
}
 