package com.guhui.order.api.feign;

import com.guhui.order.api.entity.BizResult;
import com.guhui.order.api.vo.GdStoreVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by guhui ^-^ on 2019/1/15.
 */
@FeignClient(name = "boyguhui-order-service",fallback = GdStoreFeignFallBack.class)
public interface GdStoreFeignClient {

	@PostMapping("/order/getGdStoreById")
	public BizResult<GdStoreVO> getGdStoreById(GdStoreVO gdStoreVO);

}