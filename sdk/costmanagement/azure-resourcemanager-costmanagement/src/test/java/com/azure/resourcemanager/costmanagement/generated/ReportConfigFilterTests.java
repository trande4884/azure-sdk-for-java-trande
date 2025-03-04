// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.costmanagement.models.OperatorType;
import com.azure.resourcemanager.costmanagement.models.ReportConfigComparisonExpression;
import com.azure.resourcemanager.costmanagement.models.ReportConfigFilter;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReportConfigFilterTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReportConfigFilter model = BinaryData.fromString(
            "{\"and\":[{\"and\":[{\"and\":[{},{}],\"or\":[{},{},{}],\"dimensions\":{\"name\":\"jixisxyawjoyaqcs\",\"operator\":\"Contains\",\"values\":[\"pkii\",\"zyexzn\",\"lixhnrztfol\",\"bnxknalaulppg\"]},\"tags\":{\"name\":\"tpnapnyiropuhpig\",\"operator\":\"In\",\"values\":[\"ylgqgitxmedjvcsl\",\"n\",\"wwncwzzhxgk\",\"rmgucnap\"]}},{\"and\":[{},{},{},{}],\"or\":[{},{},{}],\"dimensions\":{\"name\":\"lwptfdy\",\"operator\":\"Contains\",\"values\":[\"qbuaceopzfqr\",\"huaoppp\",\"qeqxo\"]},\"tags\":{\"name\":\"dahzxctobg\",\"operator\":\"In\",\"values\":[\"moizpos\",\"mgrcfbu\",\"rmfqjhhkxbpvj\"]}},{\"and\":[{},{}],\"or\":[{},{},{},{}],\"dimensions\":{\"name\":\"j\",\"operator\":\"In\",\"values\":[\"u\",\"ivkrtsw\",\"xqzvszjfa\",\"vjfdx\"]},\"tags\":{\"name\":\"vetvt\",\"operator\":\"Contains\",\"values\":[\"qtdo\",\"mcbxvwvxysl\",\"bhsfxob\"]}}],\"or\":[{\"and\":[{},{}],\"or\":[{}],\"dimensions\":{\"name\":\"ewwwfbkrvrnsv\",\"operator\":\"Contains\",\"values\":[\"johxcrsb\"]},\"tags\":{\"name\":\"vasrruvwb\",\"operator\":\"Contains\",\"values\":[\"fsubcgjbirxbpy\",\"srfbjfdtwss\",\"t\"]}},{\"and\":[{},{}],\"or\":[{},{},{}],\"dimensions\":{\"name\":\"bexilzznfqqnv\",\"operator\":\"In\",\"values\":[\"qtaruoujmkcjhwq\",\"tjrybnwjewgdr\",\"ervnaenqpehi\",\"doy\"]},\"tags\":{\"name\":\"ifthnz\",\"operator\":\"Contains\",\"values\":[\"sl\",\"nayqi\",\"ynduha\",\"hqlkthumaqo\"]}},{\"and\":[{},{}],\"or\":[{}],\"dimensions\":{\"name\":\"uie\",\"operator\":\"Contains\",\"values\":[\"ccymvaolpsslql\",\"mmdnbbglzps\",\"iydmcwyhzdxs\",\"adbzmnvdfznud\"]},\"tags\":{\"name\":\"dvxzbncblylpst\",\"operator\":\"Contains\",\"values\":[\"hxsrzdzucersc\"]}}],\"dimensions\":{\"name\":\"t\",\"operator\":\"Contains\",\"values\":[\"fiwjmygtdssls\",\"tmweriofzpyq\",\"emwabnet\"]},\"tags\":{\"name\":\"hszhedplvwiwu\",\"operator\":\"In\",\"values\":[\"mbes\",\"dnkwwtppjflcxog\",\"okonzmnsikvmkqz\"]}}],\"or\":[{\"and\":[{\"and\":[{}],\"or\":[{},{},{}],\"dimensions\":{\"name\":\"mhhv\",\"operator\":\"Contains\",\"values\":[\"r\"]},\"tags\":{\"name\":\"dkwobdagx\",\"operator\":\"Contains\",\"values\":[\"qdxbxwa\",\"bogqxndlkzgxhu\"]}},{\"and\":[{},{},{}],\"or\":[{},{},{},{}],\"dimensions\":{\"name\":\"odxun\",\"operator\":\"Contains\",\"values\":[\"bxmubyynt\",\"lrb\",\"tkoievseotgq\"]},\"tags\":{\"name\":\"ltmuwlauwzizx\",\"operator\":\"Contains\",\"values\":[\"gcj\",\"fuzmuvpbtt\",\"um\"]}}],\"or\":[{\"and\":[{}],\"or\":[{},{},{}],\"dimensions\":{\"name\":\"nzbtbhj\",\"operator\":\"In\",\"values\":[\"kfgohdneue\"]},\"tags\":{\"name\":\"phsdyhto\",\"operator\":\"Contains\",\"values\":[\"kd\",\"wwquuvxzxclvithh\",\"zonosgg\"]}}],\"dimensions\":{\"name\":\"c\",\"operator\":\"Contains\",\"values\":[\"wdsjnkalju\",\"iiswacffgdkzze\"]},\"tags\":{\"name\":\"fvhqc\",\"operator\":\"In\",\"values\":[\"lvpnpp\",\"uflrwd\",\"hdlxyjrxsagafcn\",\"hgw\"]}},{\"and\":[{\"and\":[{},{},{}],\"or\":[{},{}],\"dimensions\":{\"name\":\"bcvkcvqvpkeq\",\"operator\":\"Contains\",\"values\":[\"drhvoodsotbo\",\"zdopcjwvnhd\"]},\"tags\":{\"name\":\"wmgxcxrsl\",\"operator\":\"In\",\"values\":[\"twuoegrpkhjwni\"]}},{\"and\":[{},{},{}],\"or\":[{},{}],\"dimensions\":{\"name\":\"cpdggkzzlvmbmp\",\"operator\":\"In\",\"values\":[\"odfvuefywsbp\",\"vmwy\",\"rfouyftaakcpw\",\"yzvqt\"]},\"tags\":{\"name\":\"ubex\",\"operator\":\"In\",\"values\":[\"ksmond\",\"mquxvypo\"]}}],\"or\":[{\"and\":[{},{},{}],\"or\":[{},{}],\"dimensions\":{\"name\":\"ojvpa\",\"operator\":\"In\",\"values\":[\"xysmoc\",\"bq\",\"qvmkcxo\",\"apvhelxprgly\"]},\"tags\":{\"name\":\"dd\",\"operator\":\"In\",\"values\":[\"bcuejrjxgci\",\"ibrhosxsdqr\",\"zoymibmrqyibahw\",\"luszdtmhrkwof\"]}},{\"and\":[{},{},{}],\"or\":[{},{}],\"dimensions\":{\"name\":\"cpi\",\"operator\":\"Contains\",\"values\":[\"btgiwbwoenwas\"]},\"tags\":{\"name\":\"tdtkcn\",\"operator\":\"Contains\",\"values\":[\"bpokulpiujwaasip\",\"i\",\"obyu\",\"erpqlpqwcciuqg\"]}},{\"and\":[{},{}],\"or\":[{}],\"dimensions\":{\"name\":\"uvfbtkuwh\",\"operator\":\"Contains\",\"values\":[\"ykojoxafnndlpic\",\"koymkcd\",\"h\",\"pkkpw\"]},\"tags\":{\"name\":\"eqnovvqfovl\",\"operator\":\"In\",\"values\":[\"wsuwsyr\",\"ndsytgadg\"]}},{\"and\":[{},{},{},{}],\"or\":[{},{},{}],\"dimensions\":{\"name\":\"neqn\",\"operator\":\"In\",\"values\":[\"rwlqu\",\"ijfqkacewiipfp\",\"bjibwwiftohq\",\"vpuvks\"]},\"tags\":{\"name\":\"lsa\",\"operator\":\"Contains\",\"values\":[\"n\"]}}],\"dimensions\":{\"name\":\"ynl\",\"operator\":\"In\",\"values\":[\"uopxodlqiyntor\",\"ihleos\",\"swsrms\",\"yzrpzbchckqqzq\"]},\"tags\":{\"name\":\"xiy\",\"operator\":\"In\",\"values\":[\"i\",\"ynkedyatrwyhqmib\",\"yhwitsmypyynpcdp\",\"mnzgmwznmabi\"]}}],\"dimensions\":{\"name\":\"sorgj\",\"operator\":\"Contains\",\"values\":[\"ldtlwwr\",\"kdmtncvokotll\"]},\"tags\":{\"name\":\"yhgsy\",\"operator\":\"Contains\",\"values\":[\"gjltdtbnnhado\",\"crkvcikhnv\",\"amqgxqquezikyw\",\"gxk\"]}}")
            .toObject(ReportConfigFilter.class);
        Assertions.assertEquals("jixisxyawjoyaqcs", model.and().get(0).and().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).and().get(0).dimensions().operator());
        Assertions.assertEquals("pkii", model.and().get(0).and().get(0).dimensions().values().get(0));
        Assertions.assertEquals("tpnapnyiropuhpig", model.and().get(0).and().get(0).tags().name());
        Assertions.assertEquals(OperatorType.IN, model.and().get(0).and().get(0).tags().operator());
        Assertions.assertEquals("ylgqgitxmedjvcsl", model.and().get(0).and().get(0).tags().values().get(0));
        Assertions.assertEquals("ewwwfbkrvrnsv", model.and().get(0).or().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).or().get(0).dimensions().operator());
        Assertions.assertEquals("johxcrsb", model.and().get(0).or().get(0).dimensions().values().get(0));
        Assertions.assertEquals("vasrruvwb", model.and().get(0).or().get(0).tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).or().get(0).tags().operator());
        Assertions.assertEquals("fsubcgjbirxbpy", model.and().get(0).or().get(0).tags().values().get(0));
        Assertions.assertEquals("t", model.and().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).dimensions().operator());
        Assertions.assertEquals("fiwjmygtdssls", model.and().get(0).dimensions().values().get(0));
        Assertions.assertEquals("hszhedplvwiwu", model.and().get(0).tags().name());
        Assertions.assertEquals(OperatorType.IN, model.and().get(0).tags().operator());
        Assertions.assertEquals("mbes", model.and().get(0).tags().values().get(0));
        Assertions.assertEquals("mhhv", model.or().get(0).and().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).and().get(0).dimensions().operator());
        Assertions.assertEquals("r", model.or().get(0).and().get(0).dimensions().values().get(0));
        Assertions.assertEquals("dkwobdagx", model.or().get(0).and().get(0).tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).and().get(0).tags().operator());
        Assertions.assertEquals("qdxbxwa", model.or().get(0).and().get(0).tags().values().get(0));
        Assertions.assertEquals("nzbtbhj", model.or().get(0).or().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.IN, model.or().get(0).or().get(0).dimensions().operator());
        Assertions.assertEquals("kfgohdneue", model.or().get(0).or().get(0).dimensions().values().get(0));
        Assertions.assertEquals("phsdyhto", model.or().get(0).or().get(0).tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).or().get(0).tags().operator());
        Assertions.assertEquals("kd", model.or().get(0).or().get(0).tags().values().get(0));
        Assertions.assertEquals("c", model.or().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).dimensions().operator());
        Assertions.assertEquals("wdsjnkalju", model.or().get(0).dimensions().values().get(0));
        Assertions.assertEquals("fvhqc", model.or().get(0).tags().name());
        Assertions.assertEquals(OperatorType.IN, model.or().get(0).tags().operator());
        Assertions.assertEquals("lvpnpp", model.or().get(0).tags().values().get(0));
        Assertions.assertEquals("sorgj", model.dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.dimensions().operator());
        Assertions.assertEquals("ldtlwwr", model.dimensions().values().get(0));
        Assertions.assertEquals("yhgsy", model.tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.tags().operator());
        Assertions.assertEquals("gjltdtbnnhado", model.tags().values().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReportConfigFilter model = new ReportConfigFilter()
            .withAnd(Arrays.asList(new ReportConfigFilter()
                .withAnd(Arrays.asList(new ReportConfigFilter()
                    .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                    .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(), new ReportConfigFilter()))
                    .withDimensions(new ReportConfigComparisonExpression().withName("jixisxyawjoyaqcs")
                        .withOperator(OperatorType.CONTAINS)
                        .withValues(Arrays.asList("pkii", "zyexzn", "lixhnrztfol", "bnxknalaulppg")))
                    .withTags(new ReportConfigComparisonExpression()
                        .withName("tpnapnyiropuhpig")
                        .withOperator(OperatorType.IN)
                        .withValues(Arrays.asList("ylgqgitxmedjvcsl", "n", "wwncwzzhxgk", "rmgucnap"))),
                    new ReportConfigFilter()
                        .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                            new ReportConfigFilter(), new ReportConfigFilter()))
                        .withOr(
                            Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(), new ReportConfigFilter()))
                        .withDimensions(new ReportConfigComparisonExpression().withName("lwptfdy")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(Arrays.asList("qbuaceopzfqr", "huaoppp", "qeqxo")))
                        .withTags(new ReportConfigComparisonExpression().withName("dahzxctobg")
                            .withOperator(OperatorType.IN)
                            .withValues(Arrays.asList("moizpos", "mgrcfbu", "rmfqjhhkxbpvj"))),
                    new ReportConfigFilter().withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                        .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                            new ReportConfigFilter(), new ReportConfigFilter()))
                        .withDimensions(new ReportConfigComparisonExpression().withName("j")
                            .withOperator(OperatorType.IN)
                            .withValues(Arrays.asList("u", "ivkrtsw", "xqzvszjfa", "vjfdx")))
                        .withTags(new ReportConfigComparisonExpression().withName("vetvt")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(Arrays.asList("qtdo", "mcbxvwvxysl", "bhsfxob")))))
                .withOr(Arrays.asList(
                    new ReportConfigFilter().withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                        .withOr(Arrays.asList(new ReportConfigFilter()))
                        .withDimensions(new ReportConfigComparisonExpression().withName("ewwwfbkrvrnsv")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(Arrays.asList("johxcrsb")))
                        .withTags(new ReportConfigComparisonExpression()
                            .withName("vasrruvwb")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(Arrays.asList("fsubcgjbirxbpy", "srfbjfdtwss", "t"))),
                    new ReportConfigFilter().withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                        .withOr(
                            Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(), new ReportConfigFilter()))
                        .withDimensions(new ReportConfigComparisonExpression().withName("bexilzznfqqnv")
                            .withOperator(OperatorType.IN)
                            .withValues(Arrays.asList("qtaruoujmkcjhwq", "tjrybnwjewgdr", "ervnaenqpehi", "doy")))
                        .withTags(
                            new ReportConfigComparisonExpression().withName("ifthnz")
                                .withOperator(OperatorType.CONTAINS)
                                .withValues(Arrays.asList("sl", "nayqi", "ynduha", "hqlkthumaqo"))),
                    new ReportConfigFilter().withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                        .withOr(Arrays.asList(new ReportConfigFilter()))
                        .withDimensions(new ReportConfigComparisonExpression().withName("uie")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(
                                Arrays.asList("ccymvaolpsslql", "mmdnbbglzps", "iydmcwyhzdxs", "adbzmnvdfznud")))
                        .withTags(new ReportConfigComparisonExpression().withName("dvxzbncblylpst")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(Arrays.asList("hxsrzdzucersc")))))
                .withDimensions(new ReportConfigComparisonExpression().withName("t")
                    .withOperator(OperatorType.CONTAINS)
                    .withValues(Arrays.asList("fiwjmygtdssls", "tmweriofzpyq", "emwabnet")))
                .withTags(new ReportConfigComparisonExpression().withName("hszhedplvwiwu")
                    .withOperator(OperatorType.IN)
                    .withValues(Arrays.asList("mbes", "dnkwwtppjflcxog", "okonzmnsikvmkqz")))))
            .withOr(
                Arrays.asList(
                    new ReportConfigFilter()
                        .withAnd(Arrays.asList(
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("mhhv")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("r")))
                                .withTags(new ReportConfigComparisonExpression().withName("dkwobdagx")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("qdxbxwa", "bogqxndlkzgxhu"))),
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter(), new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("odxun")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("bxmubyynt", "lrb", "tkoievseotgq")))
                                .withTags(new ReportConfigComparisonExpression()
                                    .withName("ltmuwlauwzizx")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("gcj", "fuzmuvpbtt", "um")))))
                        .withOr(Arrays.asList(new ReportConfigFilter().withAnd(Arrays.asList(new ReportConfigFilter()))
                            .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                new ReportConfigFilter()))
                            .withDimensions(new ReportConfigComparisonExpression().withName("nzbtbhj")
                                .withOperator(OperatorType.IN)
                                .withValues(Arrays.asList("kfgohdneue")))
                            .withTags(new ReportConfigComparisonExpression().withName("phsdyhto")
                                .withOperator(OperatorType.CONTAINS)
                                .withValues(Arrays.asList("kd", "wwquuvxzxclvithh", "zonosgg")))))
                        .withDimensions(new ReportConfigComparisonExpression().withName("c")
                            .withOperator(OperatorType.CONTAINS)
                            .withValues(Arrays.asList("wdsjnkalju", "iiswacffgdkzze")))
                        .withTags(new ReportConfigComparisonExpression().withName("fvhqc")
                            .withOperator(OperatorType.IN)
                            .withValues(Arrays.asList("lvpnpp", "uflrwd", "hdlxyjrxsagafcn", "hgw"))),
                    new ReportConfigFilter()
                        .withAnd(Arrays.asList(
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("bcvkcvqvpkeq")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("drhvoodsotbo", "zdopcjwvnhd")))
                                .withTags(new ReportConfigComparisonExpression().withName("wmgxcxrsl")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("twuoegrpkhjwni"))),
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("cpdggkzzlvmbmp")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("odfvuefywsbp", "vmwy", "rfouyftaakcpw", "yzvqt")))
                                .withTags(new ReportConfigComparisonExpression().withName("ubex")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("ksmond", "mquxvypo")))))
                        .withOr(Arrays.asList(
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("ojvpa")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("xysmoc", "bq", "qvmkcxo", "apvhelxprgly")))
                                .withTags(new ReportConfigComparisonExpression().withName("dd")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("bcuejrjxgci", "ibrhosxsdqr", "zoymibmrqyibahw",
                                        "luszdtmhrkwof"))),
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("cpi")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("btgiwbwoenwas")))
                                .withTags(new ReportConfigComparisonExpression().withName("tdtkcn")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("bpokulpiujwaasip", "i", "obyu", "erpqlpqwcciuqg"))),
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("uvfbtkuwh")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("ykojoxafnndlpic", "koymkcd", "h", "pkkpw")))
                                .withTags(new ReportConfigComparisonExpression().withName("eqnovvqfovl")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("wsuwsyr", "ndsytgadg"))),
                            new ReportConfigFilter()
                                .withAnd(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter(), new ReportConfigFilter()))
                                .withOr(Arrays.asList(new ReportConfigFilter(), new ReportConfigFilter(),
                                    new ReportConfigFilter()))
                                .withDimensions(new ReportConfigComparisonExpression().withName("neqn")
                                    .withOperator(OperatorType.IN)
                                    .withValues(Arrays.asList("rwlqu", "ijfqkacewiipfp", "bjibwwiftohq", "vpuvks")))
                                .withTags(new ReportConfigComparisonExpression().withName("lsa")
                                    .withOperator(OperatorType.CONTAINS)
                                    .withValues(Arrays.asList("n")))))
                        .withDimensions(new ReportConfigComparisonExpression().withName("ynl")
                            .withOperator(OperatorType.IN)
                            .withValues(Arrays.asList("uopxodlqiyntor", "ihleos", "swsrms", "yzrpzbchckqqzq")))
                        .withTags(new ReportConfigComparisonExpression().withName("xiy")
                            .withOperator(OperatorType.IN)
                            .withValues(Arrays.asList("i", "ynkedyatrwyhqmib", "yhwitsmypyynpcdp", "mnzgmwznmabi")))))
            .withDimensions(new ReportConfigComparisonExpression().withName("sorgj")
                .withOperator(OperatorType.CONTAINS)
                .withValues(Arrays.asList("ldtlwwr", "kdmtncvokotll")))
            .withTags(new ReportConfigComparisonExpression().withName("yhgsy")
                .withOperator(OperatorType.CONTAINS)
                .withValues(Arrays.asList("gjltdtbnnhado", "crkvcikhnv", "amqgxqquezikyw", "gxk")));
        model = BinaryData.fromObject(model).toObject(ReportConfigFilter.class);
        Assertions.assertEquals("jixisxyawjoyaqcs", model.and().get(0).and().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).and().get(0).dimensions().operator());
        Assertions.assertEquals("pkii", model.and().get(0).and().get(0).dimensions().values().get(0));
        Assertions.assertEquals("tpnapnyiropuhpig", model.and().get(0).and().get(0).tags().name());
        Assertions.assertEquals(OperatorType.IN, model.and().get(0).and().get(0).tags().operator());
        Assertions.assertEquals("ylgqgitxmedjvcsl", model.and().get(0).and().get(0).tags().values().get(0));
        Assertions.assertEquals("ewwwfbkrvrnsv", model.and().get(0).or().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).or().get(0).dimensions().operator());
        Assertions.assertEquals("johxcrsb", model.and().get(0).or().get(0).dimensions().values().get(0));
        Assertions.assertEquals("vasrruvwb", model.and().get(0).or().get(0).tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).or().get(0).tags().operator());
        Assertions.assertEquals("fsubcgjbirxbpy", model.and().get(0).or().get(0).tags().values().get(0));
        Assertions.assertEquals("t", model.and().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.and().get(0).dimensions().operator());
        Assertions.assertEquals("fiwjmygtdssls", model.and().get(0).dimensions().values().get(0));
        Assertions.assertEquals("hszhedplvwiwu", model.and().get(0).tags().name());
        Assertions.assertEquals(OperatorType.IN, model.and().get(0).tags().operator());
        Assertions.assertEquals("mbes", model.and().get(0).tags().values().get(0));
        Assertions.assertEquals("mhhv", model.or().get(0).and().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).and().get(0).dimensions().operator());
        Assertions.assertEquals("r", model.or().get(0).and().get(0).dimensions().values().get(0));
        Assertions.assertEquals("dkwobdagx", model.or().get(0).and().get(0).tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).and().get(0).tags().operator());
        Assertions.assertEquals("qdxbxwa", model.or().get(0).and().get(0).tags().values().get(0));
        Assertions.assertEquals("nzbtbhj", model.or().get(0).or().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.IN, model.or().get(0).or().get(0).dimensions().operator());
        Assertions.assertEquals("kfgohdneue", model.or().get(0).or().get(0).dimensions().values().get(0));
        Assertions.assertEquals("phsdyhto", model.or().get(0).or().get(0).tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).or().get(0).tags().operator());
        Assertions.assertEquals("kd", model.or().get(0).or().get(0).tags().values().get(0));
        Assertions.assertEquals("c", model.or().get(0).dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.or().get(0).dimensions().operator());
        Assertions.assertEquals("wdsjnkalju", model.or().get(0).dimensions().values().get(0));
        Assertions.assertEquals("fvhqc", model.or().get(0).tags().name());
        Assertions.assertEquals(OperatorType.IN, model.or().get(0).tags().operator());
        Assertions.assertEquals("lvpnpp", model.or().get(0).tags().values().get(0));
        Assertions.assertEquals("sorgj", model.dimensions().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.dimensions().operator());
        Assertions.assertEquals("ldtlwwr", model.dimensions().values().get(0));
        Assertions.assertEquals("yhgsy", model.tags().name());
        Assertions.assertEquals(OperatorType.CONTAINS, model.tags().operator());
        Assertions.assertEquals("gjltdtbnnhado", model.tags().values().get(0));
    }
}
