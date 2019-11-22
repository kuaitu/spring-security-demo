package com.lmk.springsecuritydemo.open.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lmk.springsecuritydemo.base.utils.Ret;
import com.lmk.springsecuritydemo.sys.entity.DictItem;
import com.lmk.springsecuritydemo.sys.service.IDictItemService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = { "开放接口" })
@RestController
@RequestMapping("/Open")
public class OpenController {

    protected Gson gson = (new GsonBuilder()).setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    @Autowired
    private IDictItemService dictItemService;

    @PostMapping({"getSysDictItem.action"})
    @ResponseBody
    public Ret<List<DictItem>> getSysDictItem(@RequestParam int page,
                                              @RequestParam int rows,
                                              @RequestParam(required = false, defaultValue = "{}") String exampleJson) {
        DictItem item = null;
        if (!Strings.isNullOrEmpty(exampleJson)) {
            item = gson.fromJson(exampleJson, DictItem.class);
        }

        Wrapper<DictItem> q = null;
        if (null != item) {
            q = dictItemService.buildWrapper(item);
        }

        IPage<DictItem> items = dictItemService.page(new Page((long)page, (long)rows), q);
        return Ret.ok(items.getRecords(), items.getTotal());
    }
}
