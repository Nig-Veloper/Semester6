# Aim : Practical of hypothesis testing 


dataf <- seq(1,20, by=1)
dataf

mean(dataf)
a<-t.test(dataf, alternative="two.sided", mu=10,conf.int=0.95)
a
a$p.value
a$statistic
(10.5-10)/(sd(dataf)/sqrt(length(dataf)))