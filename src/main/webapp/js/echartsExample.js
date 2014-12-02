option = {
    title : {
        text: 'δ��һ�����±仯',
        subtext: '�����鹹'
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:['�������','�������']
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {show: true, type: ['line', 'bar']},
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            boundaryGap : false,
            data : ['��һ','�ܶ�','����','����','����','����','����']
        }
    ],
    yAxis : [
        {
            type : 'value',
            axisLabel : {
                formatter: '{value} ��C'
            }
        }
    ],
    series : [
        {
            name:'�������',
            type:'line',
            data:[11, 11, 15, 13, 12, 13, 10],
            markPoint : {
                data : [
                    {type : 'max', name: '���ֵ'},
                    {type : 'min', name: '��Сֵ'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: 'ƽ��ֵ'}
                ]
            }
        },
        {
            name:'�������',
            type:'line',
            data:[1, -2, 2, 5, 3, 2, 0],
            markPoint : {
                data : [
                    {name : '�����', value : -2, xAxis: 1, yAxis: -1.5}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name : 'ƽ��ֵ'}
                ]
            }
        }
    ]
};
                    