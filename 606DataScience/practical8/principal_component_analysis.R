# load the iris dataset
data(iris)

# standardize the data
iris_scaled <- scale(iris[,1:4])

# perform PCA
pca <- prcomp(iris_scaled, scale = FALSE)

# print the summary of PCA results
summary(pca)

# plot the first two principal components
plot(pca$x[,1], pca$x[,2], col = iris$Species, pch = 19, xlab = "PC1", ylab = "PC2")
legend("topright", legend = levels(iris$Species), col = 1:3, pch = 19)
