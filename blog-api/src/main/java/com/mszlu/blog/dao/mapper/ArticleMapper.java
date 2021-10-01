package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.dos.Archives;
import com.mszlu.blog.dao.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author playwechat Email:1036907088@qq.com
 * @Description
 * @date 2021/9/4 14:40
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();
}
