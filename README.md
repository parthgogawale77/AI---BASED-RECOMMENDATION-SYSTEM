# AI---BASED-RECOMMENDATION-SYSTEM
COMPONY: CODETECH IT SOLUTIONS

NAME: PARTH NAMDEV GOGAWALE

INTERN ID: CTIS9713

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTOSH

DESCRIPTION:

This project implements an AI-based Recommendation System using Java and Apache Mahout to suggest products according to user preferences and behavior. Recommendation systems are widely used in modern applications such as e-commerce websites, online streaming platforms, social media platforms, and digital content services. Their purpose is to help users discover products or content that match their interests. Instead of manually searching through a large number of options, users receive personalized suggestions based on their previous interactions and preferences.

The recommendation engine in this project is developed using Apache Mahout, an open-source machine learning library that provides scalable algorithms for recommendation systems, clustering, and classification. The project uses collaborative filtering, which is one of the most popular recommendation techniques. Collaborative filtering predicts user interests by analyzing patterns in user behavior and comparing similarities among users. It assumes that users who shared similar preferences in the past may also have similar interests in the future.

A sample dataset is created in a CSV file named data.csv. The dataset contains User IDs, Product IDs, and Ratings. Each rating represents the preference of a user toward a particular product. This data acts as input for the recommendation engine. The application reads the data and processes it using Mahout’s data modeling techniques. The ratings provide the foundation for identifying relationships between users and products.

The implementation begins with the FileDataModel class provided by Mahout, which loads the dataset from the CSV file and converts it into a structured format suitable for analysis. Once the data is loaded, the system calculates similarities among users using the PearsonCorrelationSimilarity method. Pearson correlation is a statistical technique that identifies relationships between user rating patterns. Users with similar ratings receive a higher similarity score.

After calculating user similarities, the system creates neighborhoods using NearestNUserNeighborhood. This method identifies the nearest users who have preferences similar to the target user. In this project, the top two similar users are selected. These neighboring users help the recommendation system determine which products are likely to be preferred by the target user.

The GenericUserBasedRecommender class combines the dataset, similarity calculations, and user neighborhoods to create a complete recommendation engine. The system then generates recommendations for a specific user by predicting products that the user has not yet rated but similar users have liked. The engine assigns a recommendation score to each product indicating the confidence level of the prediction.

During execution, the system successfully recommends Product 104 to User 1 with a score of 5.0. This indicates that users with similar interests rated Product 104 highly, and therefore the system predicts that User 1 may also prefer it. The recommendation output demonstrates the successful implementation of collaborative filtering and intelligent prediction techniques.
OUTPUT : 
