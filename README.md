# BuildVarientSample

This sample is use to add multipal productFlavors of build like
1 To change package name of appliaction 
2 change server (production ,development) 
3 enable REPORT_CRASHES in production mode 
4 multipal log handling for production and developmet server 
5 encyption and decryption handling 
6 set sign certificate for realse build 
7 change multipal launcher icon for each flavour of server

 productFlavors {
            development_server {
                applicationId "com.buildvarientsample.development"
                buildConfigField 'String', 'HOST', '"http://192.168.1.34:3000"'
                buildConfigField 'String', 'FLAVOR_SERVER', '"development"'
                buildConfigField "boolean", "REPORT_CRASHES", "false"
            }

            production_server {
                applicationId "com.buildvarientsample.production"
                buildConfigField 'String', 'HOST', '"http://api.zuul.com"'
                buildConfigField 'String', 'FLAVOR_SERVER', '"prododuction"'
                buildConfigField "boolean", "REPORT_CRASHES", "true"
            }
