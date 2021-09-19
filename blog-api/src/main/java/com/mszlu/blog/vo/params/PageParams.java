package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description 页面参数
 * @date 2021/9/5 10:19
 */
@Data
public class PageParams {
    private int page =1;//默认值是1

    private int pageSize = 10;//每页显示10条数据

}
