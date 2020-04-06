package com.oscar.springboot.app.auth;

public class JwtConfig {
	
	public static final String LLAVE_SECRETA = "llaveñ-secreta.12345";
	
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEowIBAAKCAQEAv/FzrDGbQcSvxDByFQN3ERkyQlJRTkc25P7IACGFYoEeaqs7\n" + 
			"rhl9QKFPjhebXh9V8FjxmOMjqTMINkc/H/99Gm0nb1LHk4b2xeiMk+jVUCqsmFZ3\n" + 
			"8xHba1TC/99/XRk+/D+emMYJYWtk+OX89iEZU8a8WOTeIHi9hNs18B+KSm/18zUO\n" + 
			"qjRBVCwbLvFEmLwW2JQouxS1GO8LGOHIo9XvLzgshn/8CUBCWhcYkyqLAHxEa7pF\n" + 
			"75YN5Yg/aoujk8x4IBzolAc3uSjq9pUruotJ21Mlj1KIerAzxEsiCRDm8AGzs2Qq\n" + 
			"Zey9y1tEw7H3467vL3vJzRSi1gxX8djZ3q5e5wIDAQABAoIBABgZ1EFp1SnT7ZH/\n" + 
			"10NGNRwjgskLFwRyMrVcPHavvtTYi54vNAYvUyfbWWbpFewimSLduDBPTPoA22Yd\n" + 
			"WhLFfMrlq87xoPeoObIt+gDUenxfb16NdPBDbL60XOvN/2sMMXlw75QVQbZGyt3p\n" + 
			"2vJ4w3peeOXcjvuazYkyETq+axnfb1htkFh+dUC+qBoYY+/EPt4n54Ce/8vZ/rSN\n" + 
			"8DriSkzQLEMbfzzkosFZqU4bnNggFfL3J33ZDpub0B/pBkykdnJhcju+HhkI2mQt\n" + 
			"zswmerRGXKww8UD8f7DCU5d7amQv1n0Lv5Ua/ncGDV/dsvosHnSR6V/F/+mH3lyW\n" + 
			"69RGaSkCgYEA5jHhf3cNdaWxxkk/ffH1Ar70usUAyVEwe0s26wm/Q9p4F0MRRiH4\n" + 
			"i/eDnWA+3DQY/mFCzAnFjpMArYIeeb8/vlKwa+tzqDMiLW4TZZo7jUtpkih6shsz\n" + 
			"RCza8eSH6cZFkBD0oO3UhtZemPT1X0/lf/6cS+3HQ3niN4dJkOhWMHUCgYEA1XXT\n" + 
			"lPwAImiT4JYpy5/FuJg24ZQxFrdLQKzDworML/qMmDHNBhdxCWquxmXRfXeF9Vdd\n" + 
			"vAFcQhQEe5xr2avloknddR/G7WhBjh8SF3KeWtLjmrny05tBzouVweWJxUWKKAZK\n" + 
			"L6EkJJoRqFthY0ptfHv9s2PxBKjLRvJYBYLD5msCgYEAjbk2KUEGA2HBQuBD++mk\n" + 
			"vE0O5ZJ2unuHCtGy/SAiJsdx2niLQQ+XM61u1cy0xuQ4Yx1Ef9SgUfhFmY2b778E\n" + 
			"osvMHJV4vpzEtQ2pWYuMkKBWXgsYB2HhvV6UagsWdqKAn4Mg6ZejmmSPF0Lxcv4A\n" + 
			"wT3jwoehf/Shhyh+7X1t2yUCgYAq1y/0qbLZNQXgwCJ5RIKpLpttIJHNjlHjFAlh\n" + 
			"5Ptf8bf/35bXTyMXkbqsBMlLlg5jk/oy/k7m0B+qM1WN5Sr8LDjvBcal5ROrE19N\n" + 
			"J2rSrZqSdhlfELzfWDJhLNE+r1sv9zsyXfPkCKvcjyJ3i/t3TWc4dqlrlvjdL0wt\n" + 
			"JvZsKwKBgDwFjwTWJ3EGnCp5nzRS8eArX8qzD8slMtL+pY2ktcZ0coHIKELT9rRk\n" + 
			"N7msGbUxxUGKynRYcsDJI8pBpN5V7c0meDy20OfpBEnSYFjfJnf+DKNkWuLIMMW8\n" + 
			"XTpGTbQKYW/QptCQci8Mq1XMQg7NKiRyRROYV0o0DM8vS1hZ0pQK\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAv/FzrDGbQcSvxDByFQN3\n" + 
			"ERkyQlJRTkc25P7IACGFYoEeaqs7rhl9QKFPjhebXh9V8FjxmOMjqTMINkc/H/99\n" + 
			"Gm0nb1LHk4b2xeiMk+jVUCqsmFZ38xHba1TC/99/XRk+/D+emMYJYWtk+OX89iEZ\n" + 
			"U8a8WOTeIHi9hNs18B+KSm/18zUOqjRBVCwbLvFEmLwW2JQouxS1GO8LGOHIo9Xv\n" + 
			"Lzgshn/8CUBCWhcYkyqLAHxEa7pF75YN5Yg/aoujk8x4IBzolAc3uSjq9pUruotJ\n" + 
			"21Mlj1KIerAzxEsiCRDm8AGzs2QqZey9y1tEw7H3467vL3vJzRSi1gxX8djZ3q5e\n" + 
			"5wIDAQAB\n" + 
			"-----END PUBLIC KEY-----";
}
