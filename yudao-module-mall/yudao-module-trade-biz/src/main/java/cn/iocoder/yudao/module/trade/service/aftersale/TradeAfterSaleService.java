package cn.iocoder.yudao.module.trade.service.aftersale;

import cn.iocoder.yudao.module.trade.controller.admin.aftersale.vo.TradeAfterSaleDisagreeReqVO;
import cn.iocoder.yudao.module.trade.controller.admin.aftersale.vo.TradeAfterSaleRefuseReqVO;
import cn.iocoder.yudao.module.trade.controller.app.aftersale.vo.AppTradeAfterSaleCreateReqVO;
import cn.iocoder.yudao.module.trade.controller.app.aftersale.vo.AppTradeAfterSaleDeliveryReqVO;

/**
 * 交易售后 Service 接口
 *
 * @author 芋道源码
 */
public interface TradeAfterSaleService {

    /**
     * 【会员】创建交易售后
     * <p>
     * 一般是用户发起售后请求
     *
     * @param userId 会员用户编号
     * @param createReqVO 创建 Request 信息
     * @return 交易售后编号
     */
    Long createAfterSale(Long userId, AppTradeAfterSaleCreateReqVO createReqVO);

    /**
     * 【管理员】同意交易售后
     *
     * @param userId 管理员用户编号
     * @param id 交易售后编号
     */
    void agreeAfterSale(Long userId, Long id);

    /**
     * 【管理员】拒绝交易售后
     *
     * @param userId 管理员用户编号
     * @param auditReqVO 审批 Request 信息
     */
    void disagreeAfterSale(Long userId, TradeAfterSaleDisagreeReqVO auditReqVO);

    /**
     * 【会员】退回货物
     *
     * @param userId 会员用户编号
     * @param deliveryReqVO 退货 Request 信息
     */
    void deliveryAfterSale(Long userId, AppTradeAfterSaleDeliveryReqVO deliveryReqVO);

    /**
     * 【管理员】确认收货
     *
     * @param userId 管理员编号
     * @param id 交易售后编号
     */
    void receiveAfterSale(Long userId, Long id);

    /**
     * 【管理员】拒绝收货
     *
     * @param userId 管理员用户编号
     * @param confirmReqVO 收货 Request 信息
     */
    void refuseAfterSale(Long userId, TradeAfterSaleRefuseReqVO confirmReqVO);

    /**
     * 【管理员】确认退款
     *
     * @param userId 管理员用户编号
     * @param userIp 管理员用户 IP
     * @param id 售后编号
     */
    void refundAfterSale(Long userId, String userIp, Long id);

}
