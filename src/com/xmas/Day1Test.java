package com.xmas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day1Test {

    Day1 sut = new Day1();

    @Test
    public void  puzzle1() {
        var result = sut.countIncrease(day1Input);
        assertEquals(1832, result);
        System.out.println(result);
    }

    @Test
        public  void puzzle2() {
        var result = sut.countWindowIncrease(day1Input);
        assertTrue(result < 1859);
        assertEquals(1858, result);
        System.out.println(result);
    }


    String day1Input = "193\n"
        + "195\n"
        + "204\n"
        + "208\n"
        + "219\n"
        + "230\n"
        + "231\n"
        + "233\n"
        + "234\n"
        + "241\n"
        + "253\n"
        + "260\n"
        + "261\n"
        + "265\n"
        + "268\n"
        + "279\n"
        + "277\n"
        + "297\n"
        + "299\n"
        + "300\n"
        + "306\n"
        + "308\n"
        + "312\n"
        + "313\n"
        + "329\n"
        + "349\n"
        + "361\n"
        + "362\n"
        + "369\n"
        + "371\n"
        + "373\n"
        + "378\n"
        + "380\n"
        + "382\n"
        + "383\n"
        + "382\n"
        + "384\n"
        + "385\n"
        + "386\n"
        + "388\n"
        + "417\n"
        + "419\n"
        + "424\n"
        + "429\n"
        + "435\n"
        + "438\n"
        + "439\n"
        + "454\n"
        + "468\n"
        + "498\n"
        + "504\n"
        + "510\n"
        + "512\n"
        + "514\n"
        + "518\n"
        + "526\n"
        + "528\n"
        + "533\n"
        + "555\n"
        + "561\n"
        + "565\n"
        + "585\n"
        + "590\n"
        + "617\n"
        + "633\n"
        + "635\n"
        + "640\n"
        + "641\n"
        + "652\n"
        + "653\n"
        + "657\n"
        + "659\n"
        + "673\n"
        + "690\n"
        + "696\n"
        + "690\n"
        + "691\n"
        + "712\n"
        + "718\n"
        + "708\n"
        + "711\n"
        + "723\n"
        + "733\n"
        + "734\n"
        + "736\n"
        + "739\n"
        + "738\n"
        + "739\n"
        + "761\n"
        + "764\n"
        + "767\n"
        + "768\n"
        + "774\n"
        + "779\n"
        + "791\n"
        + "797\n"
        + "800\n"
        + "804\n"
        + "807\n"
        + "810\n"
        + "811\n"
        + "810\n"
        + "812\n"
        + "814\n"
        + "813\n"
        + "817\n"
        + "827\n"
        + "824\n"
        + "847\n"
        + "848\n"
        + "850\n"
        + "852\n"
        + "880\n"
        + "882\n"
        + "892\n"
        + "896\n"
        + "898\n"
        + "899\n"
        + "900\n"
        + "906\n"
        + "921\n"
        + "933\n"
        + "935\n"
        + "937\n"
        + "935\n"
        + "937\n"
        + "944\n"
        + "951\n"
        + "955\n"
        + "963\n"
        + "964\n"
        + "979\n"
        + "981\n"
        + "985\n"
        + "996\n"
        + "997\n"
        + "998\n"
        + "1005\n"
        + "1009\n"
        + "1011\n"
        + "1015\n"
        + "1019\n"
        + "1021\n"
        + "1022\n"
        + "1006\n"
        + "1009\n"
        + "1017\n"
        + "1018\n"
        + "1019\n"
        + "1022\n"
        + "1028\n"
        + "1022\n"
        + "1023\n"
        + "1043\n"
        + "1046\n"
        + "1047\n"
        + "1053\n"
        + "1054\n"
        + "1078\n"
        + "1079\n"
        + "1091\n"
        + "1111\n"
        + "1115\n"
        + "1119\n"
        + "1127\n"
        + "1128\n"
        + "1129\n"
        + "1130\n"
        + "1147\n"
        + "1160\n"
        + "1161\n"
        + "1176\n"
        + "1177\n"
        + "1171\n"
        + "1183\n"
        + "1189\n"
        + "1190\n"
        + "1191\n"
        + "1193\n"
        + "1195\n"
        + "1201\n"
        + "1203\n"
        + "1215\n"
        + "1219\n"
        + "1229\n"
        + "1222\n"
        + "1206\n"
        + "1212\n"
        + "1232\n"
        + "1235\n"
        + "1242\n"
        + "1257\n"
        + "1258\n"
        + "1261\n"
        + "1267\n"
        + "1269\n"
        + "1267\n"
        + "1265\n"
        + "1267\n"
        + "1273\n"
        + "1275\n"
        + "1278\n"
        + "1282\n"
        + "1285\n"
        + "1288\n"
        + "1306\n"
        + "1330\n"
        + "1345\n"
        + "1354\n"
        + "1355\n"
        + "1358\n"
        + "1360\n"
        + "1358\n"
        + "1367\n"
        + "1368\n"
        + "1366\n"
        + "1363\n"
        + "1365\n"
        + "1366\n"
        + "1367\n"
        + "1369\n"
        + "1371\n"
        + "1374\n"
        + "1377\n"
        + "1378\n"
        + "1381\n"
        + "1382\n"
        + "1387\n"
        + "1400\n"
        + "1421\n"
        + "1425\n"
        + "1445\n"
        + "1459\n"
        + "1461\n"
        + "1463\n"
        + "1483\n"
        + "1487\n"
        + "1488\n"
        + "1490\n"
        + "1491\n"
        + "1493\n"
        + "1531\n"
        + "1544\n"
        + "1546\n"
        + "1548\n"
        + "1549\n"
        + "1556\n"
        + "1559\n"
        + "1563\n"
        + "1544\n"
        + "1558\n"
        + "1577\n"
        + "1590\n"
        + "1592\n"
        + "1599\n"
        + "1596\n"
        + "1599\n"
        + "1617\n"
        + "1621\n"
        + "1623\n"
        + "1624\n"
        + "1627\n"
        + "1628\n"
        + "1631\n"
        + "1634\n"
        + "1666\n"
        + "1696\n"
        + "1697\n"
        + "1700\n"
        + "1699\n"
        + "1710\n"
        + "1715\n"
        + "1717\n"
        + "1720\n"
        + "1730\n"
        + "1726\n"
        + "1727\n"
        + "1741\n"
        + "1739\n"
        + "1745\n"
        + "1751\n"
        + "1754\n"
        + "1763\n"
        + "1765\n"
        + "1767\n"
        + "1792\n"
        + "1797\n"
        + "1798\n"
        + "1814\n"
        + "1838\n"
        + "1852\n"
        + "1858\n"
        + "1884\n"
        + "1889\n"
        + "1898\n"
        + "1899\n"
        + "1898\n"
        + "1907\n"
        + "1908\n"
        + "1921\n"
        + "1922\n"
        + "1942\n"
        + "1944\n"
        + "1954\n"
        + "1956\n"
        + "1961\n"
        + "1967\n"
        + "1971\n"
        + "1972\n"
        + "1973\n"
        + "1995\n"
        + "2021\n"
        + "2027\n"
        + "2039\n"
        + "2045\n"
        + "2043\n"
        + "2044\n"
        + "2048\n"
        + "2055\n"
        + "2056\n"
        + "2058\n"
        + "2083\n"
        + "2086\n"
        + "2093\n"
        + "2106\n"
        + "2107\n"
        + "2110\n"
        + "2112\n"
        + "2118\n"
        + "2121\n"
        + "2133\n"
        + "2139\n"
        + "2146\n"
        + "2150\n"
        + "2155\n"
        + "2160\n"
        + "2164\n"
        + "2165\n"
        + "2166\n"
        + "2160\n"
        + "2159\n"
        + "2158\n"
        + "2164\n"
        + "2175\n"
        + "2179\n"
        + "2186\n"
        + "2191\n"
        + "2192\n"
        + "2196\n"
        + "2187\n"
        + "2207\n"
        + "2214\n"
        + "2222\n"
        + "2223\n"
        + "2225\n"
        + "2229\n"
        + "2231\n"
        + "2228\n"
        + "2229\n"
        + "2230\n"
        + "2233\n"
        + "2236\n"
        + "2238\n"
        + "2241\n"
        + "2245\n"
        + "2225\n"
        + "2229\n"
        + "2231\n"
        + "2235\n"
        + "2237\n"
        + "2240\n"
        + "2243\n"
        + "2245\n"
        + "2246\n"
        + "2249\n"
        + "2250\n"
        + "2251\n"
        + "2256\n"
        + "2259\n"
        + "2271\n"
        + "2272\n"
        + "2273\n"
        + "2268\n"
        + "2269\n"
        + "2270\n"
        + "2275\n"
        + "2272\n"
        + "2273\n"
        + "2275\n"
        + "2276\n"
        + "2282\n"
        + "2285\n"
        + "2289\n"
        + "2300\n"
        + "2306\n"
        + "2337\n"
        + "2338\n"
        + "2359\n"
        + "2353\n"
        + "2354\n"
        + "2357\n"
        + "2364\n"
        + "2370\n"
        + "2359\n"
        + "2360\n"
        + "2361\n"
        + "2373\n"
        + "2384\n"
        + "2398\n"
        + "2399\n"
        + "2395\n"
        + "2403\n"
        + "2406\n"
        + "2408\n"
        + "2414\n"
        + "2415\n"
        + "2420\n"
        + "2419\n"
        + "2427\n"
        + "2443\n"
        + "2455\n"
        + "2457\n"
        + "2477\n"
        + "2479\n"
        + "2487\n"
        + "2488\n"
        + "2491\n"
        + "2493\n"
        + "2496\n"
        + "2505\n"
        + "2511\n"
        + "2513\n"
        + "2514\n"
        + "2517\n"
        + "2546\n"
        + "2530\n"
        + "2532\n"
        + "2533\n"
        + "2537\n"
        + "2541\n"
        + "2542\n"
        + "2541\n"
        + "2567\n"
        + "2576\n"
        + "2592\n"
        + "2611\n"
        + "2616\n"
        + "2622\n"
        + "2640\n"
        + "2665\n"
        + "2679\n"
        + "2687\n"
        + "2693\n"
        + "2699\n"
        + "2706\n"
        + "2715\n"
        + "2721\n"
        + "2742\n"
        + "2739\n"
        + "2756\n"
        + "2762\n"
        + "2771\n"
        + "2772\n"
        + "2773\n"
        + "2770\n"
        + "2788\n"
        + "2789\n"
        + "2798\n"
        + "2799\n"
        + "2800\n"
        + "2801\n"
        + "2800\n"
        + "2803\n"
        + "2807\n"
        + "2808\n"
        + "2812\n"
        + "2815\n"
        + "2848\n"
        + "2854\n"
        + "2855\n"
        + "2857\n"
        + "2858\n"
        + "2868\n"
        + "2870\n"
        + "2884\n"
        + "2888\n"
        + "2890\n"
        + "2900\n"
        + "2901\n"
        + "2909\n"
        + "2912\n"
        + "2918\n"
        + "2919\n"
        + "2925\n"
        + "2939\n"
        + "2942\n"
        + "2956\n"
        + "2963\n"
        + "2967\n"
        + "2968\n"
        + "2972\n"
        + "2986\n"
        + "2998\n"
        + "3001\n"
        + "3023\n"
        + "3037\n"
        + "3047\n"
        + "3050\n"
        + "3054\n"
        + "3062\n"
        + "3065\n"
        + "3064\n"
        + "3066\n"
        + "3067\n"
        + "3068\n"
        + "3082\n"
        + "3084\n"
        + "3090\n"
        + "3097\n"
        + "3099\n"
        + "3098\n"
        + "3094\n"
        + "3078\n"
        + "3081\n"
        + "3083\n"
        + "3085\n"
        + "3068\n"
        + "3076\n"
        + "3077\n"
        + "3078\n"
        + "3080\n"
        + "3086\n"
        + "3090\n"
        + "3102\n"
        + "3107\n"
        + "3111\n"
        + "3114\n"
        + "3119\n"
        + "3124\n"
        + "3125\n"
        + "3126\n"
        + "3127\n"
        + "3131\n"
        + "3135\n"
        + "3137\n"
        + "3138\n"
        + "3139\n"
        + "3143\n"
        + "3173\n"
        + "3190\n"
        + "3191\n"
        + "3192\n"
        + "3194\n"
        + "3198\n"
        + "3199\n"
        + "3200\n"
        + "3194\n"
        + "3196\n"
        + "3220\n"
        + "3222\n"
        + "3223\n"
        + "3210\n"
        + "3213\n"
        + "3214\n"
        + "3218\n"
        + "3232\n"
        + "3243\n"
        + "3251\n"
        + "3266\n"
        + "3267\n"
        + "3266\n"
        + "3270\n"
        + "3273\n"
        + "3275\n"
        + "3278\n"
        + "3283\n"
        + "3300\n"
        + "3306\n"
        + "3307\n"
        + "3326\n"
        + "3329\n"
        + "3332\n"
        + "3333\n"
        + "3334\n"
        + "3340\n"
        + "3343\n"
        + "3345\n"
        + "3359\n"
        + "3361\n"
        + "3362\n"
        + "3373\n"
        + "3378\n"
        + "3379\n"
        + "3380\n"
        + "3383\n"
        + "3386\n"
        + "3409\n"
        + "3422\n"
        + "3431\n"
        + "3433\n"
        + "3434\n"
        + "3438\n"
        + "3454\n"
        + "3479\n"
        + "3481\n"
        + "3490\n"
        + "3503\n"
        + "3511\n"
        + "3516\n"
        + "3503\n"
        + "3505\n"
        + "3530\n"
        + "3527\n"
        + "3529\n"
        + "3532\n"
        + "3553\n"
        + "3556\n"
        + "3557\n"
        + "3562\n"
        + "3571\n"
        + "3572\n"
        + "3574\n"
        + "3575\n"
        + "3584\n"
        + "3602\n"
        + "3603\n"
        + "3606\n"
        + "3597\n"
        + "3624\n"
        + "3644\n"
        + "3669\n"
        + "3670\n"
        + "3676\n"
        + "3690\n"
        + "3713\n"
        + "3714\n"
        + "3741\n"
        + "3743\n"
        + "3725\n"
        + "3745\n"
        + "3749\n"
        + "3758\n"
        + "3759\n"
        + "3775\n"
        + "3796\n"
        + "3798\n"
        + "3799\n"
        + "3805\n"
        + "3817\n"
        + "3818\n"
        + "3829\n"
        + "3869\n"
        + "3886\n"
        + "3881\n"
        + "3882\n"
        + "3887\n"
        + "3888\n"
        + "3907\n"
        + "3902\n"
        + "3901\n"
        + "3922\n"
        + "3920\n"
        + "3897\n"
        + "3890\n"
        + "3920\n"
        + "3937\n"
        + "3947\n"
        + "3949\n"
        + "3953\n"
        + "3967\n"
        + "3976\n"
        + "3977\n"
        + "3988\n"
        + "3998\n"
        + "3999\n"
        + "4004\n"
        + "4009\n"
        + "3973\n"
        + "3975\n"
        + "3988\n"
        + "3990\n"
        + "3994\n"
        + "4001\n"
        + "4005\n"
        + "4016\n"
        + "4017\n"
        + "4018\n"
        + "4027\n"
        + "4028\n"
        + "4023\n"
        + "4029\n"
        + "4000\n"
        + "4001\n"
        + "4002\n"
        + "4009\n"
        + "4010\n"
        + "4013\n"
        + "4014\n"
        + "4029\n"
        + "4032\n"
        + "4034\n"
        + "4039\n"
        + "4040\n"
        + "4050\n"
        + "4055\n"
        + "4050\n"
        + "4055\n"
        + "4058\n"
        + "4059\n"
        + "4061\n"
        + "4064\n"
        + "4080\n"
        + "4082\n"
        + "4081\n"
        + "4082\n"
        + "4084\n"
        + "4085\n"
        + "4088\n"
        + "4090\n"
        + "4091\n"
        + "4109\n"
        + "4118\n"
        + "4119\n"
        + "4140\n"
        + "4145\n"
        + "4150\n"
        + "4151\n"
        + "4147\n"
        + "4150\n"
        + "4156\n"
        + "4175\n"
        + "4177\n"
        + "4178\n"
        + "4181\n"
        + "4182\n"
        + "4183\n"
        + "4191\n"
        + "4190\n"
        + "4191\n"
        + "4223\n"
        + "4225\n"
        + "4233\n"
        + "4263\n"
        + "4270\n"
        + "4277\n"
        + "4280\n"
        + "4302\n"
        + "4304\n"
        + "4316\n"
        + "4319\n"
        + "4320\n"
        + "4312\n"
        + "4320\n"
        + "4321\n"
        + "4356\n"
        + "4354\n"
        + "4355\n"
        + "4361\n"
        + "4374\n"
        + "4402\n"
        + "4384\n"
        + "4389\n"
        + "4390\n"
        + "4392\n"
        + "4390\n"
        + "4402\n"
        + "4408\n"
        + "4409\n"
        + "4449\n"
        + "4453\n"
        + "4454\n"
        + "4462\n"
        + "4464\n"
        + "4465\n"
        + "4467\n"
        + "4469\n"
        + "4470\n"
        + "4472\n"
        + "4474\n"
        + "4473\n"
        + "4474\n"
        + "4478\n"
        + "4490\n"
        + "4493\n"
        + "4495\n"
        + "4503\n"
        + "4506\n"
        + "4509\n"
        + "4512\n"
        + "4524\n"
        + "4525\n"
        + "4526\n"
        + "4541\n"
        + "4557\n"
        + "4558\n"
        + "4559\n"
        + "4560\n"
        + "4561\n"
        + "4568\n"
        + "4583\n"
        + "4584\n"
        + "4587\n"
        + "4589\n"
        + "4598\n"
        + "4603\n"
        + "4606\n"
        + "4607\n"
        + "4610\n"
        + "4611\n"
        + "4612\n"
        + "4627\n"
        + "4630\n"
        + "4653\n"
        + "4656\n"
        + "4657\n"
        + "4659\n"
        + "4660\n"
        + "4682\n"
        + "4684\n"
        + "4683\n"
        + "4684\n"
        + "4685\n"
        + "4686\n"
        + "4691\n"
        + "4692\n"
        + "4701\n"
        + "4702\n"
        + "4706\n"
        + "4713\n"
        + "4714\n"
        + "4745\n"
        + "4772\n"
        + "4773\n"
        + "4781\n"
        + "4783\n"
        + "4802\n"
        + "4807\n"
        + "4812\n"
        + "4815\n"
        + "4821\n"
        + "4823\n"
        + "4825\n"
        + "4831\n"
        + "4832\n"
        + "4847\n"
        + "4848\n"
        + "4849\n"
        + "4850\n"
        + "4858\n"
        + "4857\n"
        + "4858\n"
        + "4874\n"
        + "4852\n"
        + "4858\n"
        + "4869\n"
        + "4882\n"
        + "4884\n"
        + "4886\n"
        + "4896\n"
        + "4887\n"
        + "4888\n"
        + "4893\n"
        + "4903\n"
        + "4907\n"
        + "4909\n"
        + "4905\n"
        + "4915\n"
        + "4940\n"
        + "4944\n"
        + "4961\n"
        + "4967\n"
        + "4968\n"
        + "4960\n"
        + "4983\n"
        + "4987\n"
        + "4986\n"
        + "4988\n"
        + "4991\n"
        + "4993\n"
        + "4983\n"
        + "4985\n"
        + "4987\n"
        + "4989\n"
        + "4993\n"
        + "4994\n"
        + "4967\n"
        + "4980\n"
        + "4975\n"
        + "4980\n"
        + "4999\n"
        + "5000\n"
        + "5001\n"
        + "5003\n"
        + "5005\n"
        + "5007\n"
        + "5016\n"
        + "5024\n"
        + "5026\n"
        + "5027\n"
        + "5028\n"
        + "5029\n"
        + "5030\n"
        + "5045\n"
        + "5055\n"
        + "5056\n"
        + "5066\n"
        + "5064\n"
        + "5081\n"
        + "5083\n"
        + "5084\n"
        + "5090\n"
        + "5061\n"
        + "5063\n"
        + "5069\n"
        + "5091\n"
        + "5102\n"
        + "5103\n"
        + "5106\n"
        + "5116\n"
        + "5123\n"
        + "5141\n"
        + "5146\n"
        + "5149\n"
        + "5150\n"
        + "5167\n"
        + "5168\n"
        + "5170\n"
        + "5171\n"
        + "5182\n"
        + "5181\n"
        + "5185\n"
        + "5186\n"
        + "5191\n"
        + "5195\n"
        + "5213\n"
        + "5232\n"
        + "5233\n"
        + "5242\n"
        + "5251\n"
        + "5266\n"
        + "5270\n"
        + "5268\n"
        + "5269\n"
        + "5284\n"
        + "5290\n"
        + "5294\n"
        + "5300\n"
        + "5302\n"
        + "5303\n"
        + "5304\n"
        + "5332\n"
        + "5335\n"
        + "5329\n"
        + "5332\n"
        + "5334\n"
        + "5343\n"
        + "5346\n"
        + "5356\n"
        + "5357\n"
        + "5363\n"
        + "5365\n"
        + "5366\n"
        + "5367\n"
        + "5373\n"
        + "5377\n"
        + "5384\n"
        + "5394\n"
        + "5395\n"
        + "5392\n"
        + "5403\n"
        + "5405\n"
        + "5394\n"
        + "5399\n"
        + "5401\n"
        + "5412\n"
        + "5413\n"
        + "5416\n"
        + "5418\n"
        + "5424\n"
        + "5429\n"
        + "5402\n"
        + "5408\n"
        + "5418\n"
        + "5420\n"
        + "5428\n"
        + "5430\n"
        + "5437\n"
        + "5438\n"
        + "5442\n"
        + "5444\n"
        + "5474\n"
        + "5486\n"
        + "5488\n"
        + "5501\n"
        + "5514\n"
        + "5520\n"
        + "5519\n"
        + "5522\n"
        + "5547\n"
        + "5551\n"
        + "5553\n"
        + "5557\n"
        + "5558\n"
        + "5581\n"
        + "5583\n"
        + "5587\n"
        + "5572\n"
        + "5575\n"
        + "5574\n"
        + "5575\n"
        + "5578\n"
        + "5593\n"
        + "5595\n"
        + "5596\n"
        + "5597\n"
        + "5606\n"
        + "5612\n"
        + "5613\n"
        + "5623\n"
        + "5624\n"
        + "5636\n"
        + "5637\n"
        + "5646\n"
        + "5671\n"
        + "5675\n"
        + "5680\n"
        + "5691\n"
        + "5693\n"
        + "5720\n"
        + "5721\n"
        + "5733\n"
        + "5738\n"
        + "5750\n"
        + "5729\n"
        + "5730\n"
        + "5731\n"
        + "5732\n"
        + "5734\n"
        + "5729\n"
        + "5748\n"
        + "5750\n"
        + "5751\n"
        + "5753\n"
        + "5756\n"
        + "5761\n"
        + "5768\n"
        + "5771\n"
        + "5775\n"
        + "5777\n"
        + "5791\n"
        + "5793\n"
        + "5795\n"
        + "5798\n"
        + "5795\n"
        + "5808\n"
        + "5809\n"
        + "5810\n"
        + "5812\n"
        + "5813\n"
        + "5820\n"
        + "5821\n"
        + "5824\n"
        + "5854\n"
        + "5868\n"
        + "5869\n"
        + "5874\n"
        + "5880\n"
        + "5886\n"
        + "5887\n"
        + "5908\n"
        + "5909\n"
        + "5918\n"
        + "5926\n"
        + "5931\n"
        + "5941\n"
        + "5957\n"
        + "5967\n"
        + "5960\n"
        + "5961\n"
        + "5958\n"
        + "5971\n"
        + "5973\n"
        + "5975\n"
        + "5976\n"
        + "5978\n"
        + "5979\n"
        + "5986\n"
        + "5991\n"
        + "5994\n"
        + "5977\n"
        + "5982\n"
        + "5983\n"
        + "5987\n"
        + "5989\n"
        + "6013\n"
        + "6012\n"
        + "6019\n"
        + "6022\n"
        + "6033\n"
        + "6034\n"
        + "6037\n"
        + "6038\n"
        + "6066\n"
        + "6068\n"
        + "6073\n"
        + "6075\n"
        + "6077\n"
        + "6082\n"
        + "6094\n"
        + "6108\n"
        + "6109\n"
        + "6111\n"
        + "6113\n"
        + "6116\n"
        + "6117\n"
        + "6121\n"
        + "6122\n"
        + "6124\n"
        + "6129\n"
        + "6132\n"
        + "6140\n"
        + "6141\n"
        + "6153\n"
        + "6164\n"
        + "6185\n"
        + "6183\n"
        + "6197\n"
        + "6198\n"
        + "6196\n"
        + "6203\n"
        + "6204\n"
        + "6224\n"
        + "6227\n"
        + "6230\n"
        + "6231\n"
        + "6240\n"
        + "6257\n"
        + "6259\n"
        + "6261\n"
        + "6280\n"
        + "6288\n"
        + "6290\n"
        + "6291\n"
        + "6293\n"
        + "6304\n"
        + "6306\n"
        + "6308\n"
        + "6310\n"
        + "6316\n"
        + "6319\n"
        + "6334\n"
        + "6335\n"
        + "6336\n"
        + "6337\n"
        + "6345\n"
        + "6346\n"
        + "6347\n"
        + "6350\n"
        + "6353\n"
        + "6356\n"
        + "6364\n"
        + "6369\n"
        + "6374\n"
        + "6380\n"
        + "6384\n"
        + "6403\n"
        + "6410\n"
        + "6411\n"
        + "6415\n"
        + "6416\n"
        + "6417\n"
        + "6419\n"
        + "6420\n"
        + "6433\n"
        + "6437\n"
        + "6443\n"
        + "6454\n"
        + "6455\n"
        + "6458\n"
        + "6481\n"
        + "6492\n"
        + "6496\n"
        + "6517\n"
        + "6527\n"
        + "6532\n"
        + "6547\n"
        + "6548\n"
        + "6552\n"
        + "6560\n"
        + "6553\n"
        + "6568\n"
        + "6572\n"
        + "6574\n"
        + "6575\n"
        + "6571\n"
        + "6576\n"
        + "6580\n"
        + "6596\n"
        + "6597\n"
        + "6624\n"
        + "6628\n"
        + "6629\n"
        + "6642\n"
        + "6645\n"
        + "6629\n"
        + "6634\n"
        + "6640\n"
        + "6645\n"
        + "6646\n"
        + "6655\n"
        + "6661\n"
        + "6673\n"
        + "6680\n"
        + "6683\n"
        + "6674\n"
        + "6679\n"
        + "6690\n"
        + "6691\n"
        + "6692\n"
        + "6707\n"
        + "6713\n"
        + "6714\n"
        + "6721\n"
        + "6741\n"
        + "6746\n"
        + "6762\n"
        + "6766\n"
        + "6767\n"
        + "6773\n"
        + "6784\n"
        + "6785\n"
        + "6786\n"
        + "6790\n"
        + "6791\n"
        + "6792\n"
        + "6824\n"
        + "6828\n"
        + "6833\n"
        + "6835\n"
        + "6836\n"
        + "6837\n"
        + "6838\n"
        + "6826\n"
        + "6829\n"
        + "6864\n"
        + "6876\n"
        + "6877\n"
        + "6878\n"
        + "6880\n"
        + "6882\n"
        + "6883\n"
        + "6889\n"
        + "6900\n"
        + "6901\n"
        + "6938\n"
        + "6939\n"
        + "6943\n"
        + "6949\n"
        + "6955\n"
        + "6959\n"
        + "6961\n"
        + "6962\n"
        + "6965\n"
        + "6967\n"
        + "6968\n"
        + "6969\n"
        + "6983\n"
        + "6989\n"
        + "6997\n"
        + "6998\n"
        + "7002\n"
        + "6981\n"
        + "6995\n"
        + "6997\n"
        + "7005\n"
        + "7023\n"
        + "7026\n"
        + "7036\n"
        + "7041\n"
        + "7043\n"
        + "7052\n"
        + "7067\n"
        + "7068\n"
        + "7069\n"
        + "7079\n"
        + "7088\n"
        + "7098\n"
        + "7111\n"
        + "7109\n"
        + "7119\n"
        + "7120\n"
        + "7121\n"
        + "7129\n"
        + "7130\n"
        + "7142\n"
        + "7144\n"
        + "7141\n"
        + "7145\n"
        + "7150\n"
        + "7151\n"
        + "7173\n"
        + "7179\n"
        + "7180\n"
        + "7182\n"
        + "7191\n"
        + "7205\n"
        + "7207\n"
        + "7209\n"
        + "7218\n"
        + "7229\n"
        + "7239\n"
        + "7241\n"
        + "7243\n"
        + "7271\n"
        + "7265\n"
        + "7267\n"
        + "7269\n"
        + "7272\n"
        + "7274\n"
        + "7276\n"
        + "7305\n"
        + "7306\n"
        + "7307\n"
        + "7308\n"
        + "7311\n"
        + "7313\n"
        + "7316\n"
        + "7318\n"
        + "7320\n"
        + "7322\n"
        + "7340\n"
        + "7343\n"
        + "7344\n"
        + "7354\n"
        + "7360\n"
        + "7367\n"
        + "7370\n"
        + "7371\n"
        + "7372\n"
        + "7389\n"
        + "7391\n"
        + "7392\n"
        + "7399\n"
        + "7418\n"
        + "7400\n"
        + "7403\n"
        + "7404\n"
        + "7405\n"
        + "7406\n"
        + "7411\n"
        + "7395\n"
        + "7402\n"
        + "7417\n"
        + "7419\n"
        + "7420\n"
        + "7424\n"
        + "7426\n"
        + "7427\n"
        + "7414\n"
        + "7412\n"
        + "7413\n"
        + "7417\n"
        + "7420\n"
        + "7421\n"
        + "7422\n"
        + "7449\n"
        + "7454\n"
        + "7459\n"
        + "7462\n"
        + "7464\n"
        + "7463\n"
        + "7464\n"
        + "7466\n"
        + "7481\n"
        + "7486\n"
        + "7485\n"
        + "7487\n"
        + "7488\n"
        + "7489\n"
        + "7494\n"
        + "7509\n"
        + "7526\n"
        + "7529\n"
        + "7530\n"
        + "7531\n"
        + "7538\n"
        + "7541\n"
        + "7547\n"
        + "7550\n"
        + "7554\n"
        + "7561\n"
        + "7562\n"
        + "7563\n"
        + "7564\n"
        + "7566\n"
        + "7574\n"
        + "7576\n"
        + "7577\n"
        + "7578\n"
        + "7581\n"
        + "7609\n"
        + "7623\n"
        + "7626\n"
        + "7627\n"
        + "7630\n"
        + "7631\n"
        + "7653\n"
        + "7654\n"
        + "7657\n"
        + "7658\n"
        + "7659\n"
        + "7662\n"
        + "7664\n"
        + "7674\n"
        + "7675\n"
        + "7677\n"
        + "7676\n"
        + "7694\n"
        + "7696\n"
        + "7711\n"
        + "7734\n"
        + "7735\n"
        + "7742\n"
        + "7746\n"
        + "7749\n"
        + "7753\n"
        + "7759\n"
        + "7760\n"
        + "7767\n"
        + "7781\n"
        + "7805\n"
        + "7807\n"
        + "7808\n"
        + "7826\n"
        + "7843\n"
        + "7844\n"
        + "7845\n"
        + "7853\n"
        + "7870\n"
        + "7871\n"
        + "7872\n"
        + "7875\n"
        + "7876\n"
        + "7887\n"
        + "7895\n"
        + "7896\n"
        + "7913\n"
        + "7914\n"
        + "7916\n"
        + "7929\n"
        + "7933\n"
        + "7935\n"
        + "7928\n"
        + "7929\n"
        + "7930\n"
        + "7933\n"
        + "7949\n"
        + "7976\n"
        + "7977\n"
        + "7978\n"
        + "7998\n"
        + "7999\n"
        + "8002\n"
        + "8010\n"
        + "8011\n"
        + "8012\n"
        + "8015\n"
        + "8016\n"
        + "8023\n"
        + "8028\n"
        + "8029\n"
        + "8031\n"
        + "8035\n"
        + "8036\n"
        + "8037\n"
        + "8056\n"
        + "8057\n"
        + "8062\n"
        + "8067\n"
        + "8081\n"
        + "8082\n"
        + "8096\n"
        + "8099\n"
        + "8116\n"
        + "8121\n"
        + "8125\n"
        + "8126\n"
        + "8128\n"
        + "8129\n"
        + "8132\n"
        + "8119\n"
        + "8129\n"
        + "8151\n"
        + "8181\n"
        + "8161\n"
        + "8163\n"
        + "8184\n"
        + "8186\n"
        + "8191\n"
        + "8192\n"
        + "8197\n"
        + "8186\n"
        + "8184\n"
        + "8194\n"
        + "8216\n"
        + "8219\n"
        + "8220\n"
        + "8221\n"
        + "8223\n"
        + "8239\n"
        + "8240\n"
        + "8241\n"
        + "8246\n"
        + "8273\n"
        + "8274\n"
        + "8283\n"
        + "8284\n"
        + "8285\n"
        + "8293\n"
        + "8294\n"
        + "8300\n"
        + "8303\n"
        + "8305\n"
        + "8336\n"
        + "8340\n"
        + "8344\n"
        + "8347\n"
        + "8348\n"
        + "8349\n"
        + "8356\n"
        + "8363\n"
        + "8361\n"
        + "8362\n"
        + "8364\n"
        + "8365\n"
        + "8383\n"
        + "8389\n"
        + "8390\n"
        + "8405\n"
        + "8406\n"
        + "8404\n"
        + "8410\n"
        + "8411\n"
        + "8412\n"
        + "8413\n"
        + "8414\n"
        + "8419\n"
        + "8422\n"
        + "8425\n"
        + "8428\n"
        + "8448\n"
        + "8449\n"
        + "8453\n"
        + "8464\n"
        + "8466\n"
        + "8468\n"
        + "8469\n"
        + "8470\n"
        + "8478\n"
        + "8483\n"
        + "8477\n"
        + "8488\n"
        + "8489\n"
        + "8493\n"
        + "8510\n"
        + "8520\n"
        + "8533\n"
        + "8545\n"
        + "8547\n"
        + "8562\n"
        + "8560\n"
        + "8555\n"
        + "8557\n"
        + "8558\n"
        + "8559\n"
        + "8581\n"
        + "8577\n"
        + "8578\n"
        + "8579\n"
        + "8582\n"
        + "8590\n"
        + "8591\n"
        + "8569\n"
        + "8570\n"
        + "8569\n"
        + "8570\n"
        + "8573\n"
        + "8578\n"
        + "8561\n"
        + "8558\n"
        + "8563\n"
        + "8564\n"
        + "8575\n"
        + "8580\n"
        + "8582\n"
        + "8593\n"
        + "8596\n"
        + "8585\n"
        + "8588\n"
        + "8598\n"
        + "8612\n"
        + "8613\n"
        + "8622\n"
        + "8629\n"
        + "8639\n"
        + "8640\n"
        + "8647\n"
        + "8655\n"
        + "8656\n"
        + "8657\n"
        + "8671\n"
        + "8672\n"
        + "8683\n"
        + "8690\n"
        + "8691\n"
        + "8694\n"
        + "8693\n"
        + "8698\n"
        + "8706\n"
        + "8713\n"
        + "8714\n"
        + "8716\n"
        + "8718\n"
        + "8736\n"
        + "8733\n"
        + "8741\n"
        + "8731\n"
        + "8736\n"
        + "8737\n"
        + "8738\n"
        + "8746\n"
        + "8747\n"
        + "8746\n"
        + "8749\n"
        + "8761\n"
        + "8762\n"
        + "8780\n"
        + "8784\n"
        + "8785\n"
        + "8791\n"
        + "8793\n"
        + "8797\n"
        + "8807\n"
        + "8818\n"
        + "8836\n"
        + "8837\n"
        + "8838\n"
        + "8845\n"
        + "8846\n"
        + "8849\n"
        + "8857\n"
        + "8858\n"
        + "8877\n"
        + "8876\n"
        + "8875\n"
        + "8883\n"
        + "8887\n"
        + "8888\n"
        + "8892\n"
        + "8895\n"
        + "8901\n"
        + "8915\n"
        + "8916\n"
        + "8915\n"
        + "8921\n"
        + "8929\n"
        + "8935\n"
        + "8944\n"
        + "8981\n"
        + "8985\n"
        + "8990\n"
        + "8991\n"
        + "9001\n"
        + "8995\n"
        + "8998\n"
        + "9001\n"
        + "9002\n"
        + "9003\n"
        + "9026\n"
        + "9036\n"
        + "9047\n"
        + "9070\n"
        + "9080\n"
        + "9083\n"
        + "9089\n"
        + "9098\n"
        + "9118\n"
        + "9135\n"
        + "9123\n"
        + "9127\n"
        + "9131\n"
        + "9117\n"
        + "9123\n"
        + "9124\n"
        + "9131\n"
        + "9136\n"
        + "9139\n"
        + "9141\n"
        + "9144\n"
        + "9149\n"
        + "9156\n"
        + "9157\n"
        + "9160\n"
        + "9163\n"
        + "9168\n"
        + "9170\n"
        + "9177\n"
        + "9179\n"
        + "9199\n"
        + "9200\n"
        + "9211\n"
        + "9212\n"
        + "9222\n"
        + "9224\n"
        + "9211\n"
        + "9224\n"
        + "9246\n"
        + "9252\n"
        + "9277\n"
        + "9294\n"
        + "9301\n"
        + "9302\n"
        + "9310\n"
        + "9311\n"
        + "9313\n"
        + "9316\n"
        + "9319\n"
        + "9320\n"
        + "9321\n"
        + "9322\n"
        + "9323\n"
        + "9324\n"
        + "9337\n"
        + "9340\n"
        + "9357\n"
        + "9378\n"
        + "9379\n"
        + "9381\n"
        + "9397\n"
        + "9398\n"
        + "9399\n"
        + "9400\n"
        + "9405\n"
        + "9407\n"
        + "9421\n"
        + "9437\n"
        + "9438\n"
        + "9442\n"
        + "9440\n"
        + "9453\n"
        + "9458\n"
        + "9459\n"
        + "9463\n"
        + "9464\n"
        + "9465\n"
        + "9464\n"
        + "9465\n"
        + "9468\n"
        + "9478\n"
        + "9496\n"
        + "9498\n"
        + "9499\n"
        + "9504\n"
        + "9509\n"
        + "9525\n"
        + "9522\n"
        + "9523\n"
        + "9527\n"
        + "9531\n"
        + "9533\n"
        + "9537\n"
        + "9533\n"
        + "9546\n"
        + "9547\n"
        + "9570\n"
        + "9576\n"
        + "9577\n"
        + "9586\n"
        + "9604\n"
        + "9607\n"
        + "9618\n"
        + "9621\n"
        + "9643\n"
        + "9657\n"
        + "9665\n"
        + "9666\n"
        + "9667\n"
        + "9668\n"
        + "9678\n"
        + "9679\n"
        + "9680\n"
        + "9684\n"
        + "9694\n"
        + "9697\n"
        + "9694\n"
        + "9700\n"
        + "9705\n"
        + "9706\n"
        + "9708\n"
        + "9728\n"
        + "9729\n"
        + "9730\n"
        + "9732\n"
        + "9737\n"
        + "9744\n"
        + "9745\n"
        + "9758\n"
        + "9774\n"
        + "9776\n"
        + "9774\n"
        + "9771\n"
        + "9776\n"
        + "9777\n"
        + "9779\n"
        + "9780\n"
        + "9781\n"
        + "9799\n"
        + "9802\n"
        + "9803\n"
        + "9806\n"
        + "9824\n"
        + "9825\n"
        + "9828\n"
        + "9837\n"
        + "9829\n"
        + "9833\n"
        + "9836\n"
        + "9837\n"
        + "9832\n"
        + "9834\n"
        + "9835\n"
        + "9840\n"
        + "9848\n"
        + "9874\n"
        + "9890\n"
        + "9917\n"
        + "9922\n"
        + "9926\n"
        + "9928\n"
        + "9929\n"
        + "9937\n"
        + "9940\n"
        + "9947\n"
        + "9950\n"
        + "9949\n"
        + "9951\n"
        + "9952\n"
        + "9963\n"
        + "9962\n"
        + "9963\n"
        + "9997\n"
        + "10011\n"
        + "10017\n"
        + "10038\n"
        + "10039\n"
        + "10040\n"
        + "10086\n"
        + "10087\n"
        + "10088\n"
        + "10089\n"
        + "10091\n"
        + "10092\n"
        + "10103\n"
        + "10104\n"
        + "10113\n"
        + "10115\n"
        + "10132\n"
        + "10146\n"
        + "10148\n"
        + "10154\n"
        + "10158\n"
        + "10166\n"
        + "10168\n"
        + "10166\n"
        + "10167\n"
        + "10176\n"
        + "10191\n"
        + "10185\n"
        + "10191\n"
        + "10196\n"
        + "10206\n"
        + "10210\n"
        + "10212\n"
        + "10213\n"
        + "10216\n"
        + "10238\n"
        + "10254\n"
        + "10258\n"
        + "10260\n"
        + "10261\n"
        + "10267\n"
        + "10291\n"
        + "10305\n"
        + "10308\n"
        + "10313\n"
        + "10315\n"
        + "10326\n"
        + "10331\n"
        + "10339\n"
        + "10346\n"
        + "10348\n"
        + "10358\n"
        + "10381\n"
        + "10385\n"
        + "10386\n"
        + "10392\n"
        + "10393\n"
        + "10394\n"
        + "10397\n"
        + "10408\n"
        + "10431\n"
        + "10433\n"
        + "10437\n"
        + "10438\n"
        + "10443\n"
        + "10447\n"
        + "10449\n"
        + "10452\n"
        + "10454\n"
        + "10456\n"
        + "10460\n"
        + "10461\n"
        + "10462\n"
        + "10463\n"
        + "10462\n"
        + "10463\n"
        + "10480\n"
        + "10481\n"
        + "10489\n"
        + "10488\n"
        + "10491\n"
        + "10493\n"
        + "10517\n"
        + "10519\n"
        + "10537\n"
        + "10550\n"
        + "10560\n"
        + "10573\n"
        + "10588\n"
        + "10591\n"
        + "10597\n"
        + "10605\n"
        + "10609\n"
        + "10610\n"
        + "10615\n"
        + "10618\n"
        + "10620\n"
        + "10619\n"
        + "10625\n"
        + "10640\n"
        + "10642\n"
        + "10645\n"
        + "10651\n"
        + "10660\n"
        + "10659\n"
        + "10673\n"
        + "10691\n"
        + "10709\n"
        + "10711\n"
        + "10732\n"
        + "10739\n"
        + "10743\n"
        + "10751\n"
        + "10755\n"
        + "10757\n"
        + "10758\n"
        + "10761\n"
        + "10777\n"
        + "10779\n"
        + "10776\n"
        + "10783\n"
        + "10789\n"
        + "10803\n"
        + "10806\n"
        + "10825\n"
        + "10838\n"
        + "10851\n"
        + "10852\n"
        + "10853\n"
        + "10854\n"
        + "10865\n"
        + "10866\n"
        + "10876\n"
        + "10877\n"
        + "10885\n"
        + "10887\n"
        + "10899\n"
        + "10898\n"
        + "10897\n"
        + "10902\n"
        + "10907\n"
        + "10909\n"
        + "10913\n"
        + "10924\n"
        + "10950\n"
        + "10947\n"
        + "10949\n"
        + "10954\n"
        + "10965\n"
        + "10983\n";

}