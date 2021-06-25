# Example output of YamlDiff

```
========== Javers =============

Diff:
* changes on com.fasterxml.jackson.databind.node.ObjectNode/ :
  - '_children/facade/_children/datasafe/_children/key-store/_children/pbkdf/_children/pbkdf2._children' map changes :
     · entry ['saltLength' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/facade/_children/datasafe/_children/key-store/_children/pbkdf/_children/pbkdf2/_children/saltLength'] removed
  - '_children/facade/_children/datasafe/_children/key-store/_children/pbkdf/_children/pbkdf2/_children/saltLength._value' value '16' unset
  - '_children/facade/_children/datasafe/_children/key-store/_children/type._value' changed: 'BCFKS' -> 'SIMPLE'
  - '_children/facade/_children/datasafe/_children/keys._children' map changes :
     · entry ['secret' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/facade/_children/datasafe/_children/keys/_children/secret'] removed
  - '_children/facade/_children/datasafe/_children/keys/_children/secret._children' map changes :
     · entry ['size' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/facade/_children/datasafe/_children/keys/_children/secret/_children/size'] removed
     · entry ['algo' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/facade/_children/datasafe/_children/keys/_children/secret/_children/algo'] removed
  - '_children/facade/_children/datasafe/_children/keys/_children/secret/_children/algo._value' value 'AES' unset
  - '_children/facade/_children/datasafe/_children/keys/_children/secret/_children/size._value' value '128' unset
  - '_children/protocol/_children/hbci/_children/sca._children' map changes :
     · entry ['authentication-types-v2' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2'] added
     · entry ['authentication-types' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types'] removed
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2._children' map changes :
     · entry ['SMS' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/SMS'] added
     · entry ['CHIP' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/CHIP'] added
     · entry ['PHOTO' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/PHOTO'] added
     · entry ['EMAIL' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/EMAIL'] added
     · entry ['MOBILE' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/MOBILE'] added
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/CHIP._value' = 'CHIP_OTP'
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/EMAIL._value' = 'SMTP_OTP'
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/MOBILE._value' = 'SMS_OTP'
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/PHOTO._value' = 'PHOTO_OTP'
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types-v2/_children/SMS._value' = 'SMS_OTP'
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types._children' map changes :
     · entry ['SMS' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/SMS'] removed
     · entry ['CHIP' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/CHIP'] removed
     · entry ['PHOTO' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/PHOTO'] removed
     · entry ['EMAIL' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/EMAIL'] removed
     · entry ['MOBILE' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/MOBILE'] removed
     · entry ['PUSH' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/PUSH'] removed
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/CHIP._value' value 'CHIP_OTP' unset
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/EMAIL._value' value 'SMTP_OTP' unset
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/MOBILE._value' value 'SMS_OTP' unset
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/PHOTO._value' value 'PHOTO_OTP' unset
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/PUSH._value' value 'PUSH_OTP' unset
  - '_children/protocol/_children/hbci/_children/sca/_children/authentication-types/_children/SMS._value' value 'SMS_OTP' unset
  - '_children/protocol/_children/hbci/_children/urls/_children/pis/_children/redirect/_children/web-hooks._children' map changes :
     · entry ['result' : 'com.fasterxml.jackson.databind.node.ObjectNode/#_children/protocol/_children/hbci/_children/urls/_children/pis/_children/redirect/_children/web-hooks/_children/result'] removed
  - '_children/protocol/_children/hbci/_children/urls/_children/pis/_children/redirect/_children/web-hooks/_children/result._value' value '${facade.urls.embedded-ui-base-url}/pis/{authSessionId}/consent-result?redirectCode={redirectCode}' unset




========== JsonPatch =============

[ {
  "op" : "replace",
  "path" : "/facade/datasafe/key-store/type",
  "value" : "SIMPLE"
}, {
  "op" : "remove",
  "path" : "/facade/datasafe/key-store/pbkdf/pbkdf2/saltLength"
}, {
  "op" : "remove",
  "path" : "/facade/datasafe/keys/secret"
}, {
  "op" : "remove",
  "path" : "/protocol/hbci/urls/pis/redirect/web-hooks/result"
}, {
  "op" : "remove",
  "path" : "/protocol/hbci/sca/authentication-types"
}, {
  "op" : "add",
  "path" : "/protocol/hbci/sca/authentication-types-v2",
  "value" : {
    "SMS" : "SMS_OTP",
    "MOBILE" : "SMS_OTP",
    "CHIP" : "CHIP_OTP",
    "PHOTO" : "PHOTO_OTP",
    "EMAIL" : "SMTP_OTP"
  }
} ]

Process finished with exit code 0

```